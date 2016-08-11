package mock;

import java.util.Scanner;

public class Calculator {
	public static void performCalculation(){
		 	double n1, n2;
	        String operation;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter first number");
	        n1 = in. nextDouble();

	        System.out.println("Enter second number");
	        n2 = in. nextDouble();

	        Scanner op = new Scanner(System.in);
	        System.out.println("Enter operation to be performed");
	        operation = op.next();

	        switch (operation)  {
	        case "+":
	            System.out.println("Your answer is " + (n1 + n2));
	            break;

	        case "-":
	            System.out.println("Your answer is " + (n1 - n2));
	            break;

	        case "/":
	            System.out.println("Your answer is " + (n1 / n2));
	            break;

	        case "*":
	            System.out.println("Your asnwer is " + (n1 * n2));
	            break;

	        default:
	            System.out.println("Sorry!!");

	        }
	
	    }
	public static void main(String[] args) {
		performCalculation();
	}
	
		
		
	}


