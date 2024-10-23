//229099 
//POH KOK HAO 
//LAB 2 

package test;
import java.util.Scanner;
public class AreaOfCircle {
	public static void main (String [] agrs) {
		final double PI=3.1415926;
		Scanner input= new Scanner (System.in);
		System.out.print("Enter radius of a circle: ");
		double radius= input.nextDouble();
		double area= PI*Math.pow(radius,2);
		System.out.print("Area of the circle is: "+area);		
	}
}
