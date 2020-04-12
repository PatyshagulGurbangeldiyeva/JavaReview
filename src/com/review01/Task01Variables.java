package com.review01;

public class Task01Variables {

	public static void main(String[] args) {
		
		int n1=5;
		int n2=10;
		
		int sum=n1+n2;
		int sub=n1-n2;
		int mult=n1*n2;
		int div=n1/n2; // if we dev small to bigger and the result is int we will get "0" coz the answer os 0.5 
		// and just int part will be taken and it is zero
		
		System.out.println(sum);
		System.out.println(sub);
		System.out.println(mult);
		System.out.println(div);
		
		System.out.println("The sum is "+n1+n2);// cykdy 510 olur cunku cikti yapildiginda soldann sagsa gider  \
		// ilk basta string ile birlesir the sum is5+10 o yuzden boyle cikti
		
		System.out.println("The sum is "+(n1+n2));
		
		double intDiv=5/10;
		System.out.println(intDiv);
		
		double doubleDiv=5.0/10.0;
		System.out.println(doubleDiv);

	}

}
