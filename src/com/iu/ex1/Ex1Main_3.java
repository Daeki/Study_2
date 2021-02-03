package com.iu.ex1;

import java.util.Scanner;

public class Ex1Main_3 {

	public static void main(String[] args) {
		
		//n명의 학생을 생성해서 배열에 저장
		//학생수를 입력받아서 학생을 생성 배열에 저장
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 수 입력");
		//int count = sc.nextInt();
		Student [] students = new Student[sc.nextInt()];
		
		for(int i=0;i<students.length;i++) {
			//System.out.println("이름 입력");
			//student.name=sc.next();
			Student student = new Student();
			
			students[i]=new Student();
		}
		
		for(int i=0;i<students.length;i++) {
			System.out.println(students[i].name);
		}
		

	}

}
