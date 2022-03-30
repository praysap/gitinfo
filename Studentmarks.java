package demo5;

import java.util.Scanner;

public class Studentmarks {

	public static void main(String[] args) {
		int a,b,c,d,e,result;

		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter the Marks of Student");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		d=s.nextInt();
		e=s.nextInt();
	result=a+b+c+d+e/5;
	System.out.print("Average=" +result);
	
	if(result<=40) {
		System.out.println("Fail");
	}	
	else if((result>=40) && (result<=60)) {
		System.out.println("C grade");
	}
	else if((result>=60) && (result<=80)) {
		System.out.println("B grade");
	}
	else
		System.out.println("A grade");
	
	
}
}