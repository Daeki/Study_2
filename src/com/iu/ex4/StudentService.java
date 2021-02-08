package com.iu.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class StudentService {
	
	
	//studentInput
	//학생의 숫자를 입력
	//학생들의 정보를 입력
	//학생들을 리턴
	public Student [] studentInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의숫자를 입력");
		Student [] students = new Student[sc.nextInt()];
		
		for(int i=0;i<students.length;i++) {
			Student student = new Student();
			System.out.println(i+1+" 번 이름 입력");
			student.name=sc.next();
			System.out.println(i+1+" 번 번호 입력");
			student.num = sc.nextInt();
			System.out.println(i+1+" 번 국어 입력");
			student.kor = sc.nextInt();
			System.out.println(i+1+" 번 영어 입력");
			student.eng = sc.nextInt();
			System.out.println(i+1+" 번 수학 입력");
			student.math = sc.nextInt();
			
			student.total = student.kor+student.eng+student.math;
			student.avg = student.total/3.0;
			students[i]= student;
		}
		
		return students;
	}
	
	//studentView
	//학생들을 받아서 정보를 출력
	public void studentView(Student [] students) {
		if(students == null) {
			System.out.println("학생정보가 없다");
			return;
		}
		for(int i=0;i<students.length;i++) {
				System.out.println("Name : "+students[i].name);
				System.out.println("Num : "+students[i].num);
				System.out.println("Avg : "+students[i].avg);
		}
		
	}
		 

}
