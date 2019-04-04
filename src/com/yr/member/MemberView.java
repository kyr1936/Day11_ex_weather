package com.yr.member;

import java.util.HashMap;
import java.util.Iterator;

public class MemberView {
	private HashMap<String, Member> map;
	
	public void view(String str) {
		System.out.println(str);
	}
	
	public void view(Member member) {
		System.out.println("name : " + member.getName());
		System.out.println("id : " + member.getId());
		System.out.println("pw : " + member.getPw());
		System.out.println("age : " + member.getAge());
		System.out.println("Level : " + member.getLevel());
	}
	
	public void view(HashMap<String, Member> map) {
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Member member = map.get(key);
			this.view(member);
		}
		
	}
}
