package com.iu.ex1;

import java.util.Scanner;

public class Ex1Main_4 {
	public static void main(String[] args) {
		//Member Class 선언
		//id(숫자), pw(숫자), name(문자열)
		
		//3명
		//키보드로 부터 id, pw, 이름을 받아서 member의 data로 작성
		//위의 member를 배열에 대입
		Scanner sc = new Scanner(System.in);
		Member [] members = new Member[3];
		
		for(int i =0;i<members.length;i++) {
			Member member = new Member();
			System.out.println("Id 입력");
			member.id = sc.nextInt();
			System.out.println("Pw 입력");
			member.pw = sc.nextInt();
			System.out.println("Name 입력");
			member.name = sc.next();
			members[i]=member;

//------------------------------------------------			
//			members[i]=new Member();
//			System.out.println("Id 입력");
//			members[i].id=sc.nextInt();
		}
		
//		
//		//member들의 정보를 출력
//		for(int i=0;i<members.length;i++) {
//			System.out.println(members[i].id);
//			System.out.println(members[i].pw);
//			System.out.println(members[i].name);
//		}
		
//-------------------------------------------------------
		//1. 로그인
		//   로그인 성공시 000 님 로그인 성공!!
		//2. 종료
		
		
		
		
	}//main 끝
	
}
