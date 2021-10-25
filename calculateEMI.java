package inOut;
//Exercise 2:
//Create an EMI Calculator app
//
//Input:
//Loan Amount
//Rate of Interest
//Tenure
import java.math.*;
import java.util.Scanner;

//Output:
//EMI:__________
//EMI = P * [( r * (1 + r)^n)) / ((1 + r)^n - 1)]
//P = Princiapl amount borrowed
//r = Periodic monthly interest rate
//n = Total number of monthly payments
public class calculateEMI {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount loaned to you: ");
		float amount = s.nextFloat();
		System.out.println("Enter yearly rate of interest: ");
		//yearly rate
		float r = s.nextFloat();
		//monthly rate
		float rate = r/12;
		System.out.println("Enter number of months for this loan: ");
		float months = s.nextFloat();
		float pay = (float) (amount*(   (rate* Math.pow((1+rate),months)) / (Math.pow((1+rate),months) -1)  		));
		
		System.out.println("Your monthly payment will be: " + pay);
		System.out.println("Your total payment will be: " + pay*months);
		
		
		
	}
	
}
