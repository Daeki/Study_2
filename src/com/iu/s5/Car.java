package com.iu.s5;

public class Car {
	
	String company;
	String brand;
	String color;
	int door;
	//생성자 생성
	//company : AUDI
	//brand : k3
	//color : black
	//door :4
	public Car() {
		//this()
		this("Black");

		
	}
	
	public Car(String color) {
		this(color, 4);
	}
	
	public Car(String color, int door) {
		this.company="AUDI";
		this.brand="K3";
		this.color=color;
		this.door=door;
		this.info();
	}
	
	
	
	public void info() {
		System.out.println("Company : "+this.company);
		System.out.println("Brand : "+this.brand);
		System.out.println("Color : "+this.color);
		System.out.println("Door : "+this.door);
	}

}
