package com.iu.s2;

public class S2Main {

	public static void main(String[] args) {
		MethodTest methodTest = new MethodTest();
		//멤버메서드 접근
		//메서드 호출
		//참조변수명.멤버메서드()
		
		int num=20;
		
		methodTest.info();
		
		System.out.println(num);
		
		methodTest.sayHello();
		
		//sayHello2 호출
		for(int i=0;i<5;i++) {
			methodTest.salyHello2();
		}
//		methodTest.salyHello2();
//		methodTest.salyHello2();
	}

}
