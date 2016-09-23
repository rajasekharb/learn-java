package com.brs.in;

public class GuessDataType {
	public static void main(String[] args) {
		//write code to convert the value pased in args[0] into a byte
		byte numberOfBits = Byte.parseByte(args[0]);

		switch(numberOfBits) {
			case 8 : 
				System.out.println("byte");
				break;
			case 16 : 
				System.out.println("short or a char");
				break;
			case 32 : 
				System.out.println("int or a float");
				break;
			case 64 : 
				System.out.println("long or a double");
				break;
			default : 
				System.out.println("Could not guess the data type of size : " + numberOfBits + " bits");
				break;
		}
		
	}
}