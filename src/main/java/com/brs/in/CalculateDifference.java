package com.brs.in;

public class CalculateDifference {
	public static void main(String[] args) {
		double firstValue = Double.parseDouble(args[0]);
		double secondValue = Double.parseDouble(args[1]);
		
		System.out.println("The difference of args[0] and args[1] is : " + (firstValue - secondValue));
	}
}