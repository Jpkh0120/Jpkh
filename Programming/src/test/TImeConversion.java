//229099 
//POH KOK HAO 
//LAB 2 

package test;
import java.util.Scanner; 
public class TImeConversion {
	public static void main (String [] agrs) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter time in minute(s): ");
		int time_minute=input.nextInt();
		int hour = time_minute/60;
		int minute =time_minute%60;
		System.out.print(time_minute+" minute(s)= "+hour+"hour(s) and "+minute+" minute(s)");
	}
	

}
