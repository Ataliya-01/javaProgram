//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.Scanner;
class positiveZerosNegative{
	
   public static void main(String[] args){
		Scanner sc =new Scanner(System.in);

	int pos = 0, neg = 0, zero = 0;
	
	System.out.println("Enter 10 no:");
	for(int i=0;i<10;i++){
		
		int n=sc.nextInt();
	if(n>0)
		
		pos++;
	
	else if(n<0)
	
		neg++;
	
	
	else
		zero++;
	
	}
	System.out.println("\nTotal Positive Number: " +pos);
      System.out.println("Total Negative Number: " +neg);
      System.out.println("Total Zero: " +zero);
}
}



	
