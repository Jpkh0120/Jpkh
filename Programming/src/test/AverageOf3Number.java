//229099 
//POH KOK HAO 
//LAB 2 


package test;
import java.util.Scanner; 
public class AverageOf3Number {
	public static void main (String [] agrs) {
	Scanner input= new Scanner (System.in); 
	
	System.out.print("Enter num1: "); //Prompt user to enter first number
	int num1=input.nextInt();
	System.out.print("Enter num2: "); // Prompt user to enter second number
	int num2=input.nextInt();
	System.out.print("Enter num3: "); // Prompt user to enter third number
	int num3=input.nextInt();
	
	//Calculate and display the result
	double average=(num1+num2+num3)/3.0;
	System.out.printf("The average for 3 numbers is: "+average);
	
	
	}
	
	
}
