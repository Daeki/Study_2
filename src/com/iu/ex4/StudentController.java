package com.iu.ex4;

import java.util.Scanner;

public class StudentController {
	
	
	//start
	//1. 학생정보입력
	//2. 학생정보출력
	//3. 학생정보검색
	//4. 학생정보추가
	//5. 학생정보삭제
	//6. 종      료
	public void start() {
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		StudentService studentService = new StudentService();
		Student [] students=null;
		
		while(check) {
			System.out.println("1. 학생정보입력");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 프로그램종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("정보입력 실행");
				students = studentService.studentInput();
				break;
			case 2:
				System.out.println("정보출력 실행");
				studentService.studentView(students);
				break;
			default:
				System.out.println("종료");
				check=false;
			}
			
			
			
		}
		
		System.out.println("student start 끝");
	}
	

}
