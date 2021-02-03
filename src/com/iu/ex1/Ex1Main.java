package com.iu.ex1;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//3번 반복-for, while
		//for(int i=0;i<2;i++) {
		Student st1 = new Student();
		for(int i=0;i<2;i++) {
			System.out.println("이름을 입력");
			st1.name=sc.next();

			System.out.println("번호 입력");
			st1.num=sc.nextInt();
			System.out.println("국어 입력");
			st1.kor=sc.nextInt();
			System.out.println("영어 입력");
			st1.eng=sc.nextInt();
			System.out.println("수학 입력");
			st1.math=sc.nextInt();
			st1.total = st1.kor + st1.eng + st1.math;
			st1.avg = st1.total/3.0;

			System.out.println(st1.name);
			System.out.println(st1.total);
			System.out.println(st1.avg);
		}

	}

}
