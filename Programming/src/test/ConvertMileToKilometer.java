//229099 
//POH KOK HAO 
//LAB 2 


package test;
import java.util.Scanner;
public class ConvertMileToKilometer {
	public static void main (String [] agrs){
		Scanner input= new Scanner (System.in);
		final double  KILOMETER =1.6;
		System.out.print("Enter value in mile: " ); 
		double mile=input.nextDouble();
		double result=mile*KILOMETER;
		System.out.print(mile+" mile = "+ result+ " kilometers");
		
			
		
	}
	

}
