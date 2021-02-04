package com.iu.ex2;

public class Ex2Main1 {

	public static void main(String[] args) {
		
		//클래스명 참조변수명 = new 클래스명();
		Character character = new Character();
		character.name="춘식";
		
		character.hp=100;
		character.sword= null;
		character.sword.name="집행검+5";
		System.out.println(character.name);
		System.out.println(character.hp);
		System.out.println("sword : "+character.sword);
		System.out.println(character.sword.name);
		
		
		

	}

}
