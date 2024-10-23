//229099 
//POH KOK HAO 
//LAB 2 


package test;

import java.util.Scanner;

public class ConvertMetersToFeets {
	public static void main (String [] agrs){
		Scanner input= new Scanner (System.in);
		final double  FEET =3.2786;
		System.out.print("Enter value in meter: " ); 
		double meter=input.nextDouble();
		double result=meter*FEET;
		System.out.print(meter+" meter = "+ result+ " feet");
	}
}
