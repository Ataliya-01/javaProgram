//Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ..... 

import java.util.Scanner;
public class Fibonacci{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = 0, b = 1,c, n;
		System.out.println("Enter n No:");
		 n =  sc.nextInt();
		for(int i = 0; i<=n; i++){
			System.out.print(a+" ");
			c = a + b;
            a = b;
            b = c;
			
        }
	
	}
}
			
			
			