package com.iu.s1;

public class S1Main_2 {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.id="id1";
		member.pw="pw1";
		member.age=20;
		member.ki=152.2;
		
		Member member2 = member;
		member2.id="test";
		
		System.out.println(member.id);
		

	}

}
