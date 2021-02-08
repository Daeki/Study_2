package com.iu.ex4;

import java.util.Scanner;

public class MemberService {
	
	Scanner sc;
	
	public MemberService() {
		sc = new Scanner(System.in);
	}
	
	//회원가입 메서드
	//메서드명 memberJoin
	//가입할 회원수 입력
	//회원수 만큼 회원 생성
	//정보들입력
	//회원들을 리턴
	public Member [] memberJoin() {
		
		System.out.println("회원수 입력");
		int count = sc.nextInt();
		Member [] members = new Member[count];
		
		for(int i=0;i<members.length;i++) {
			Member member = new Member();
			System.out.println("Id 입력");
			member.id = sc.nextInt();
			System.out.println("Pw 입력");
			member.pw = sc.nextInt();
			System.out.println("Name 입력");
			member.name= sc.next();
			members[i]=member;
		}
		
		return members;
	}
	
	//로그인 메서드
	//메서드명 memberLogin
	//id, pw 입력
	//매개변수로 member들을 선언
	//검사결과를 리턴
	public Member memberLogin(Member [] members) {
		
		Member member = new Member();
		System.out.println("Id 입력");
		member.id = this.sc.nextInt();
		System.out.println("Pw 입력");
		member.pw = this.sc.nextInt();
		Member result = null;
		//String name=null;
		//int index=-1;
		for(int i=0;i<members.length;i++) {
			if(member.id == members[i].id && member.pw==members[i].pw) {
				//name = members[i].name;
				//index=i;
				result = members[i];
				break;
			}
		}
		
		return result;
		
	}
	

}
