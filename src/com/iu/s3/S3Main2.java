package com.iu.s3;

import java.util.Scanner;

public class S3Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test test = new Test();
		
		System.out.println("제작할 핸드폰의 갯수 입력");
		int count = sc.nextInt();
		sc.nextLine();
		Phone [] phones = new Phone[count];
		
		for(int i=0;i<phones.length;i++) {
			Phone phone = new Phone();
			System.out.println("Companay 입력");
			phone.company=sc.nextLine();
			System.out.println("Name 입력");
			phone.name=sc.nextLine();
			System.out.println("Price 입력");
			phone.price = sc.nextInt();
			System.out.println("Color 입력");
			sc.nextLine();
			phone.color = sc.nextLine();
			phones[i]=phone;
		}
		
		test.info3(phones);
		
		//핸드폰의 갯수만큼 정보를 입력
		//Scanner, 
		// next(), nextLine();
		
		

		
		
	}

}
