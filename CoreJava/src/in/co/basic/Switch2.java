package in.co.basic;

import java.util.Scanner;

public class Switch2 {
  public static void main(String[] args) {
	   int n ;
	   System.out.println("Enter code of day");
	   Scanner sc = new Scanner(System.in);
	   n = sc.nextInt();
	   switch (n) {
	   
	   
	case 0:System.out.println("sunday");
		break;
		
	case 1:System.out.println("monday");
	break;
	
	case 2:System.out.println("Tuesday");
	break;
	
	case 3:System.out.println("wensday");
	break;


	case 4:System.out.println("thrusday");
	break;
	
	case 5:System.out.println("friday");
	break;
	
	case 6:System.out.println("saturday");
	break;
		
	default:System.out.println("invalid code");
		break;
	}
}
}
