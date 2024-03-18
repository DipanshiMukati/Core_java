  //swap of two number without using third variable//
   //a=100 b =200
    //a=200 b=100
package in.co.basic;

import java.util.Scanner;

public class Swap1 {
    public static void main(String[] args) {
		 int a,b;
		 System.out.println("Enter any two Number");
		 Scanner sc = new Scanner(System.in);
		 a= sc.nextInt(); //a= 100
		 b = sc.nextInt();// b=200
		 System.out.println("Before Swapping "+a+" "+b);
		 a = a+b; //a = 100 +200=300
		 b = a-b;//b = 300 -200 =100
		 a = a-b;//a=300-100=200
		 System.out.println("After Swapping "+a+" "+b);
		 
    	
	}
}
