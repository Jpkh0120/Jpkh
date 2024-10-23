//229099 
//POH KOK HAO 
//LAB 2 


package test;
import java.util.Scanner;
public class CostOfTv {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in); 
		System.out.print("Enter price of TV: ");
		double oriPrice=input.nextDouble();
		final double tax= 0.08;
		double taxAmount=oriPrice*tax;
		System.out.printf("\nPrice of TV RM: %.2f",oriPrice);
		System.out.printf("\nAmount of tax: RM %.2f",taxAmount);
		System.out.printf("\nTotal amount to be paid: RM %.2f",(oriPrice+taxAmount));
	}

}
