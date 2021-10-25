package inOut;

import java.util.Scanner;

//Add, subtract, multiply, divide
public class calculator {
public static void main(String[] args) {
//Initialize
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter first number: ");
String f = scanner.nextLine();
System.out.println("Enter second number: ");
String s = scanner.nextLine();
//Float.valueOf(str).floatValue();
float fn=0;
float sn=0;
try {
fn = Float.valueOf(f).floatValue();
sn = Float.valueOf(s).floatValue();
}
catch(Exception e){
System.out.println("Invalid input");
System.exit(0);
}
System.out.println("Enter code of desired operation: ");
System.out.println("1.- Add ");
System.out.println("2.- Substract");
System.out.println("3.- Multiply");
System.out.println("4.- Divide");



String cd = scanner.nextLine();
float c=0;
switch(cd) {
	case "1":
		c = fn + sn;	
	break;	
	case "2":
		c = fn - sn;
	break;
	case "3":
		c = fn*sn;
	break;
	case "4":
		c = fn/sn;
	break;
	default:
		System.out.println("Option not available");
		System.exit(0);
}

System.out.println("The result is: " + c);
//Terminate Scanner
scanner.close();
}
	
	
}
