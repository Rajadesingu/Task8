package Practice;

import java.util.Scanner;


public class Digits {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int a = sc.nextInt();
		int count = 0;
		
		while (a>0) {
		
		a = a/10;
		
		count++;
		
		}
		
		System.out.println(count);
		
	
	
	}
	

}
