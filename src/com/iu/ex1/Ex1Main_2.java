package com.iu.ex1;

public class Ex1Main_2 {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.name="iu";
		st1.num=10;
		Student st2 = new Student();
		st2.name="suji";
		
		//배열
		//같은 데이터타입
		//배열선언
		Student [] students = new Student[2];
		//배열 학생 대입
		students[0]=st1;
		students[1]=st2;
		//배열에 있는 이름들을 출력
		System.out.println(students[0].name);
		System.out.println(students[1].name);
		
		
		

	}

}
