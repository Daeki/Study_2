package com.iu.s3;

public class Test {
	
	//info3
	//핸드폰의 가격의 총합과 모든 핸드폰의 정보를 출력
	public void info3(Phone [] phones) {
		int total=0;
		for(int i=0;i<phones.length;i++) {
			System.out.println("Company : "+phones[i].company);
			System.out.println("Name : "+phones[i].name);
			System.out.println("Price : "+phones[i].price);
			System.out.println("Color : "+phones[i].color);
			total = total+phones[i].price;
		}
		
		System.out.println("Total Price : "+total);
	}
	
	//info2
	//배열의 데이터를 모두 출력
	public void info2 (int [] ar) {
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
	}
	
	//info 메서드명
	//phone의 정보를 출력
	public void info(Phone phone) {//매개변수 1 개만 선언 해서 출력
		System.out.println("Company : "+phone.company);
		System.out.println("Name :"+phone.name);
		System.out.println("Price : "+phone.price);
		System.out.println("Color : "+phone.color);
		phone.company="Google";
	}
	
	
	public void t1(int num) {
		num = num*3;
		System.out.println("t1 : "+num);
	}

}
