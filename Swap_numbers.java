package Practice;

import java.util.Scanner;

public class Swap_numbers {

	public static void main(String[] args) {
	
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter the first number ");
   
   int num = sc.nextInt();
   
   System.out.println("Enter the second number ");

   int num1 = sc.nextInt();
   
   int temp = num;
   
   num = num1;
   num1 = temp;
   
   System.out.println(num);
   
   System.out.println(temp);
		
   
	}
	
	
	
}
