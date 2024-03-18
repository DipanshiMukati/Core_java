// input 10 ----> 1 2 3 4 5 10 

package in.co.basic;

import java.util.Scanner;

public class Factor {
	public static void main(String[] args) {
		
		int n ;
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			
			if (n%i==0) {
				 
				System.out.println(i+" ");
			}
			
		}
		
	}

}
