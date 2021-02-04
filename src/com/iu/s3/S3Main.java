package com.iu.s3;

public class S3Main {

	public static void main(String[] args) {
		Test test = new Test();
		int num =10;
		test.t1(num);
		System.out.println("main: "+num);
		
		Phone phone = new Phone();
		phone.company="LG";
		phone.name="Wing";
		phone.price=300;
		phone.color="White";

		test.info(phone);
		System.out.println("-----------------------");
		
		System.out.println(phone.company);
		System.out.println("-----------------------");
		int [] ar = {1,2};
		test.info2(ar);
		
		int [] ar2 = ar;
		
		ar2[0]=9;
		System.out.println(ar[0]);
	}

}
