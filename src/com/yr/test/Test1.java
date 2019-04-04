package com.yr.test;

public class Test1 {

	public static void main(String[] args) {
		StringBuffer sb =new StringBuffer();
		sb.append("iu, iu, iu, 26, 1,");
		sb.append("choa, choa, choa, 30, 2,");
		sb.append("suji, suji, suji, 23, 2,");
		sb.append("hani, hani, hani, 15, 0");
		String members = sb.toString();
		
		System.out.println(sb);
		System.out.println(members);
	}

}
