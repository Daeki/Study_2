package com.iu.s2;

public class MethodTest {
	
	//접근지정자 그외지정자 리턴타입 메서드명 (매개변수선언) {}
	//접근지정자 : 모르면 public
	//그외지정자 : 모르면 생략
	//리턴타입   : 모르면 void
	//매개변수선언 : 모르면 생략
	public void info() {
		//메인메서드내의 내용처럼 작성
		//if, for, while
		//객체생성, 변수선언
		System.out.println("info 메서드 실행");
		
		
		System.out.println("info 메서드 종료");
	}
	
	//sayHello
	//Hello world 가 3번 출력
	public void sayHello() {
		
		for(int i=0;i<3;i++) {
			System.out.println("Hello World");
		}
		
	}
	
	//sayHello2
	//hello world2 가 1번 출력
	public void salyHello2() {
		System.out.println("hello world2");
	}
	
	

}
