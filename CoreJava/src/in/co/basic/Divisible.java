package in.co.basic;

import java.util.Scanner;

public class Divisible {
	
public static void main(String[] args) {
	int n;
	System.out.println("Enter any number");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	if (n%5==0) {
		System.out.println("DIvisible by 5");
		
		
	} else {
		System.out.println("Not Divisible by 5");

	}
}

}
