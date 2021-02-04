package com.iu.ex3;

public class Salary {
	//클래스명 Salary
	//메서드명 getSal
	//받은 급여에 세금을 제하고 실급여를 출력
	//국민연금 1.2%, 의료보험 2%, 실업급여 0.5%, 산재 0.3%
	//메서드명 getSal2
	//받은 급여에 원천징수 3.3%
	public void getSal2(int sal) {
		double tax = sal*0.033;
		tax = sal -tax;
		System.out.println("실급여 : "+tax);
	}
	
	
	public void getSal(int sal) {
		//국민연금 세금
		double tax1 = sal*0.012;
		
		//의료 세금
		double tax2 = sal*0.02;
		
		//고용 
		double tax3 = sal*0.005;
		
		//산재
		double tax4 = sal*0.003;
		
		double result = tax1+tax2+tax3+tax4;
		
		result = sal - result;
		
		System.out.println("실급여액 : "+result);
	}

}
