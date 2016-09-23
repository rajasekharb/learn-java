package com.brs.in;

public class SeniorCitizenTest {
	public void checkAge(int age) {
		int SENIOR_CITIZEN_AGE = 60;
		if (age > SENIOR_CITIZEN_AGE) {
			System.out.println("Person is a senior citizen.");
		} else {
			System.out.println("Person is not a senior citizen.");
		}
	}
}