package com.iu.ex3;

import java.util.Scanner;

public class SalaryMenu {
	
	//start 메서드 
	//1. 급여계산
	//	 -- 급여 입력	
	//   -- 1. 정규직
	//          getSal
	//   -- 2. 계약직	
	//          getSal2
	//2. 프로그램종료
	public void start() {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		while(check) {
			System.out.println("1. 급여계산");
			System.out.println("2. 프로그램종료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1:
				System.out.println("급여 입력");
				int sal = sc.nextInt();
				System.out.println("1. 정규직");
				System.out.println("2. 계약직");
				select = sc.nextInt();
				Salary salary = new Salary();
				if(select==1) {
					salary.getSal(sal);
				}else {
					salary.getSal2(sal);
				}
				
				break;
			default:
				check=false;
			}
			
		}
		
	}

}





