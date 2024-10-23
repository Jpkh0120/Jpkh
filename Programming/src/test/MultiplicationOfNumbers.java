//229099 
//POH KOK HAO 
//LAB 2 


package test;
import java.util.Scanner;
public class MultiplicationOfNumbers {
	 public static void main (String [] agrs){
	        Scanner input = new Scanner (System.in); 
	        System.out.print("Enter number between 0 to 1000: ");
	        int number=input.nextInt();
	        int result;
	        int digit1;
	        int digit2;
	        int digit3;
	        int removeDigit1;
	        int removeDigit2;
	        
	        
	        if (number<10) {
	        result=number;}
	        else if (number>=10 && number<99) {
	        	digit1=number%10;
	        	digit2=number/10;
	        	result=digit1*digit2;}
	        else {
	        	digit1=number%10;
	        	removeDigit1=number/10;
	        	digit2=removeDigit1%10;
	        	removeDigit2=removeDigit1/10;
	        	digit3=removeDigit2;
	        	result=digit1*digit2*digit3;}
	        
	   
	        System.out.print("Multiplication of digit(s) for "+number+" is: "+result);
	        	      
	    
	}
}
