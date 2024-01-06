package Practice;

import java.util.Scanner;

public class Four_Integer {
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = sc.nextInt();
		
		System.out.println("Enter a number ");
		int b = sc.nextInt();
		
		System.out.println("Enter a number ");
		int c = sc.nextInt();
		
		System.out.println("Enter a number ");
		int d = sc.nextInt();
		
		if ((a+b) >= (c+d)) {
			  System.out.println("Sum of a and b greater than c and d");
			}else {
				  System.out.println("Sum of a and b is lesser than c and d.");
			}
				
		
	}
	

}
