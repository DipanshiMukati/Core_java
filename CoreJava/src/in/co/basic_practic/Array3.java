package in.co.basic_practic;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		int size;
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter array size");
		size = sc.nextInt();
		int a []= new int [size];
		for (int i = 0; i < a.length; i++) {
		  a [i] =sc.nextInt();
		}
		System.out.println("print array element");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+ " ");
			
		}
				
	}

}
