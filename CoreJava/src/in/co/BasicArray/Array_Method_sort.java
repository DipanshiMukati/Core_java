//sort() 

package in.co.BasicArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Method_sort {
	public static void main(String[] args) {

		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Data in Array");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
