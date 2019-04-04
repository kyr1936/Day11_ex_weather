package com.yr.member;

import java.util.HashMap;
import java.util.Scanner;

public class MemberController {
	private MemberInit mi;
	private MemberView mv;
	private Scanner sc;
	private HashMap<String, Member> map;

	public MemberController() {
		mi = new MemberInit();
		mv = new MemberView();
		sc = new Scanner(System.in);
	}

	public void start() {
		map = mi.setMember();
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원탈퇴");
			System.out.println("4. 회원 전체정보 보기");
			System.out.println("5. 종  료");
			int select = sc.nextInt();

			switch (select) {
			case 1: 
				Member member= mi.memberJoin();
				map.put(member.getId(), member);
				break;
			case 2:
				member = mi.memberlogin(map);
				if(member!=null) {
					mv.view("로그인 성공");
				} else {
					mv.view("로그인 실패");
				}
				break;
			case 3: 
				String str = mi.memberDelete(map);
				mv.view(str);
				break;
			case 4:
				mv.view(map);
				break;
			default :
				System.out.println("종료합니다");
			}
		}



	}
}
