package com.iu.s4;

import java.util.Scanner;

public class ReturnTest2 {
	
	//메서드명 : removeArray
	//매개변수로 int 배열 선언
	//삭제하고 싶은 숫자를 입력받아서
	//해당칸을 삭제 하고
	//배열을 리턴
	public int [] removeArray(int [] ar) {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 숫자를 입력");
		int num = sc.nextInt();
		
		int idx=-1;
		
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==num) {
				idx=i;
				break;
			}
			
		}//for 끝
		
		if(idx != -1) {
			//삭제할 index 번호가 있음
			int [] result = new int[ar.length-1];
			
			int index=0;
			for(int i=0;i<ar.length;i++) {
				if(idx==i) {
					continue;
				}
				result[index]=ar[i];
				index++;
			}
			
			ar=result;
			
		}
		
		return ar;
		
	}//메서드의 끝
	
	
	//메서드명 : addArray
	//매개변수로 int 배열 선언
	//해당배열에 한 칸을 추가하고 데이터입력
	//추가된 배열을 리턴
	public int [] addArray(int [] ar) {
		Scanner sc = new Scanner(System.in);
		int [] result = new int[ar.length+1];
		for(int i=0;i<ar.length;i++) {
			result[i]=ar[i];
		}
		System.out.println("추가 데이터 입력");
		result[result.length-1]=sc.nextInt();
		
		return result;
	}
	
	
	//메서드명 : makeArray
	//배열의 크기를 입력
	//입력받은 숫자만큼 정수를 담을 배열을 생성 하고 배열을 리턴
	public int [] makeArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기 입력");
		
		int size = sc.nextInt();
		int [] ar = new int [size];
		return ar;
	}
	
	//메서드명 : viewArray
	//매개변수로 정수배열 선언
	//배열에 들어있는 데이터 출력
	public void viewArray(int [] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
