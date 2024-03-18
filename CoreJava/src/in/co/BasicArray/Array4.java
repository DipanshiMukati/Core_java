package in.co.BasicArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
	public static void main(String[] args) {
		int a []= new int [5];
		int a2 []= new int [5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter data in Array");
		for (int i = 0; i < a.length; i++) {
		a[i] = sc.nextInt();
		
		System.out.println("Enter data in Array2");
		for (int j = i; j < a2.length; j++) {
		a2[j] = sc.nextInt();
		boolean b = Arrays.equals(a, a2);
		System.out.println("both are equals"+b);
		}
	 }
  }
}

