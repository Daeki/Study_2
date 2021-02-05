package com.iu.s4;

import java.util.Scanner;

public class ReturnTest {
	
	//method3
	//키보드로부터 이름을 입력 받아서 리턴
	public String  method3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();
		String name2 = sc.toString();
		System.out.println("toString : "+name2);
		return name;
	}
	
	public int method1(int num1, int num2) {
		int num3 = num1 +num2;
		System.out.println(num3);
		
		return num3;
	}
	
	public void method2(int num1, int num2) {
		int num3 = num1+num2;
		System.out.println(num3);
		
	}

}
