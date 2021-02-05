package com.iu.ex4;

import java.util.Scanner;

public class MemberController {
	
	
	//메서드명 : start
	//memberJoin 실행(호출)
	// 1. 로그인
	//
	// 2. 종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		MemberService memberService = new MemberService();
		Member [] members = memberService.memberJoin();
		
		boolean check =true;
		
		while(check) {
			System.out.println("1. 로그인");
			System.out.println("2. 종  료");
			int select = sc.nextInt();
			
			if(select==1) {
				Member member= memberService.memberLogin(members);
				if(member != null) {
					System.out.println(member.name+" 로그인성공");
					break;
				}else {
					System.out.println("로그인 실패");
				}
				
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		
	}

}
