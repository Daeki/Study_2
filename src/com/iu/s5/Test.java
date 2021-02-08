package com.iu.s5;

public class Test {
	int num=1;
	
	{
		//instance 초기화 블럭
		num=3;
		
	}
	
	public Test() {
		//생성자
		num=2;
	}
	
	public void setNum(int num) {
		//멤버메서드
		this.num = num;
	}
}
