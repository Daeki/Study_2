package com.iu.ex4;

public class Ex4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// test 용도
//		MemberService memberService = new MemberService();
//		Member [] members = memberService.memberJoin();
//		
//		for(int i=0;i<members.length;i++) {
//			System.out.println(members[i].id);
//			System.out.println(members[i].pw);
//			System.out.println(members[i].name);
//		}
//		
//		//memberLogin 시도
//		//로그인성공하면 000 님 로그인성공 출력
//		//로그인실패하면 로그인 실패 출력
//		//String name = memberService.memberLogin(members);
//		//int index = memberService.memberLogin(members);
//		Member member = memberService.memberLogin(members);
//		if(member != null) {
//			System.out.println(member.name+" 님 로그인 성공");
//		}else {
//			System.out.println("로그인 실패");
//		}
		
		MemberController memberController = new MemberController();
		memberController.start();
//		StudentController studentController = new StudentController();
//		studentController.start();
		
	}

}
