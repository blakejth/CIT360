package apc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Controller Control = new controller();

	Integer firstNumber;
	Integer secondNumber;
	String operator;

	Scanner in = new Scanner(System.in);
	System.out.println("Please enter your first number: ");
	firstNumber = Integer.parseInt(in.nextLine());

	System.out.println("Please enter a math symbol: ")
	operator = Integer.parseInt(in.nextLine());

	System.out.println("Please enter your second number: ");
	secondNumber = Integer.parseInt(in.nextLine());

	System.out.println(firstName + " " + operator + " " + secondNumber);
	System.out.println(Control.hashMaps(operator, firstNumber, secondNumber));

	}
}