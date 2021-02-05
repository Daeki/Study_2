package com.iu.s4;

public class S4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest returnTest = new ReturnTest();
		
		int num = returnTest.method1(10, 20);
		//int num2=returnTest.method2(10, 20);
		returnTest.method2(10, 20);
		//System.out.println("Return한 데이터 : "+num);
		
		//method3 호출 후 이름을 출력
		String name = returnTest.method3();
		System.out.println(name);
		System.out.println("프로그램 종료");
	}

}
