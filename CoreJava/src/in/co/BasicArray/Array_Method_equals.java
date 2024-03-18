package in.co.BasicArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Method_equals {

	public static void main(String[] args) {

		int a[] = new int[5];
		int a2[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data in Array2");
		for (int i = 0; i < a.length; i++) {
			a2[i] = sc.nextInt();
		}
		 boolean b = Arrays.equals(a,a2);
		 System.out.println("both are equals"+b);
		 
		}
	}


