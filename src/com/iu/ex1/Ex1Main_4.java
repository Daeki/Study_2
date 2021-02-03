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
		
		boolean check=true;
		
		while(check) {
			System.out.println("1.로그인");
			System.out.println("2.종  료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("로그인 시도");
				Member member = new Member();
				System.out.println("Id 입력");
				member.id=sc.nextInt();
				System.out.println("Pw 입력");
				member.pw=sc.nextInt();
				boolean login=false;
				for(int i=0;i<members.length;i++) {
					if(member.id==members[i].id && member.pw==members[i].pw) {
						System.out.println(members[i].name+" 로그인 성공");
						login=true;
						break;
					}
				}
			
				if(login) {
					while(login) {
						System.out.println("1.작업시작");
						System.out.println("2.로그아웃");
						select = sc.nextInt();
						if(select==1) {
							//성적관리 작업
							//학생의 수 입력
							
							//1. 학생정보입력
							//2. 전체정보출력
							//3. 학생검색출력(학생번호입력)
							//4. 종료
							
							
							
						}else {
							System.out.println("로그아웃 ---");
							break;
						}
						
					}
					
					
				}else {
					System.out.println("로그인 실패");
				}
				
				
				
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
		
		
	}//main 끝
	
}
