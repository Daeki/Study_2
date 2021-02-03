package com.iu.s1;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		
		System.out.println("S1Main 실행");
		//변수 선언 공식
		//데이터타입 변수명;
		//객체 생성 공식
		//클래스명 변수명 = new 클래스명();
		
		Member m = new Member();//회원 1명 생성
		
		Member m2 = new Member();
		
		int n = 10;
		int [] ar = new int [2];
		
		Scanner sc = new Scanner(System.in);
		
		m.id="test";
		m.pw="password";
		m.age=20;
		m.ki = 18.2;
		
		m2.id="test";
		m2.pw="password";
		m2.age=20;
		m2.ki=18.2;
		
		System.out.println(m.id);
		System.out.println(m.pw);
		System.out.println(m2.id);
		System.out.println(m2.pw);
		
		System.out.println(m == m2);//
		
		System.out.println(m);
		System.out.println(m2);
		
		m = m2;
		
		
		System.out.println(m == m2);//얕은 복사
		
		m.id=m2.id;
		

	}

}
