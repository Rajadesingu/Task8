package Practice;

import java.util.Iterator;
import java.util.Scanner;

public class Prime_Number {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("Enter a Number ");
		int num = sc.nextInt() ;
		
		for (int i = 1; i <=num; i++) {
			if(num % i ==0){
			count++;
		     }
		}
		
		if (count==2) {
			System.out.println("Prime");
		} else {

			System.out.println("Not prime");
		}
		
		
	}

}
