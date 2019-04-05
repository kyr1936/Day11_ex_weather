package com.yr.member;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MemberInit {
	private String members;
	private StringBuffer sb;
	private Member member;
	private Scanner sc;
	
	public MemberInit() {
		sc = new Scanner(System.in);
		sb =new StringBuffer();
		sb.append("iu, iu, iu, 26, 1,");
		sb.append("choa, choa, choa, 30, 2,");
		sb.append("suji, suji, suji, 23, 2,");
		sb.append("hani, hani, hani, 15, 0");
		members = sb.toString();  // StringBuffer type의  sb를 String type으로 바꾸어줌
	}
	
	// 메서드명 setMemer return 멤버들 - Member생성 -> Map으로
	// key = id , value = member객체
	
	public HashMap<String, Member> setMember() {
		
		HashMap<String, Member> map = new HashMap<String, Member>();
		StringTokenizer st = new StringTokenizer(members, ",");
		
		while(st.hasMoreTokens()) {
			member = new Member();
			member.setName(st.nextToken().trim());
			member.setId(st.nextToken().trim());
			member.setPw(st.nextToken().trim());
			member.setAge(Integer.parseInt(st.nextToken().trim()));
			member.setLevel(Integer.parseInt(st.nextToken().trim()));	
			
			map.put(member.getId(), member);
		}
		return map;
		
	}
	public Member memberJoin() {
		member= new Member();
		
		System.out.println("name을 입력하세요");
		member.setName(sc.next());
		System.out.println("id를 입력하세요");
		member.setId(sc.next());
		System.out.println("pw를 입력하세요");
		member.setPw(sc.next());
		System.out.println("age를 입력하세요");
		member.setAge(sc.nextInt());
		System.out.println("level을 입력하세요");
		member.setLevel(sc.nextInt());
		
		return member;
	}
	
	public Member memberlogin(HashMap<String, Member> map) {
		Member member = null;
		
		System.out.println("id를 입력하세요");
		String id = sc.next();
		System.out.println("pw를 입력하세요");
		String pw = sc.next();
		
		member = map.get(id);  // map에서  id를 가져와서 member중에 있다면
		if(member!=null) {   // 
			if(!member.getPw().equals(pw)) {
				member = null;  // 로그인 실패......
			}
		}
		return member;
	}
	
	public String memberDelete(HashMap<String, Member> map) {
		System.out.println("삭제할 id 입력");
		String result ="삭제 실패";
		String id = sc.next();
		Member member = map.get(id);
		if(member!=null) {
			map.remove(id);
			result = "삭제 성공";
		}
		
		
		return result;
	}
	
	
} 
