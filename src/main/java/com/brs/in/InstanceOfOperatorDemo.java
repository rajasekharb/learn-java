package com.brs.in;

public class InstanceOfOperatorDemo {
	public static void main(String[] args) {
		if (args instanceof String[]) {
			System.out.println("args instanceof String[] is true");
		}
		if (args instanceof Object) {
			System.out.println("args instanceof Object is true");
		}
	}
}