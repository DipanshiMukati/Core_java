package in.co.basicRecursion;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	
	int n ;
	System.out.println("Enter any number:");
	Scanner sc = new Scanner(System.in);
	 n=sc.nextInt();
	 Factorial f = new Factorial();
int result = f.fact(n);
	System.out.println("factorial of given Number :" +result);
	
    
}
       int fact(int n) {
    	  
    	  if (n==1) 
			return 1;
			
    	  else 
			return n*fact (n-1);
	

    	  }
}
