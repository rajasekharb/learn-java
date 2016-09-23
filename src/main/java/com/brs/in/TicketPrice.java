package com.brs.in;

public class TicketPrice {
	public void ageCheck(int age) {
		int INFANT_AGE = 3;
		int CHILD_AGE = 13;
		int SENIOR_CITIZEN_AGE = 60;
		int CENTENARIAN_AGE = 100;
		if (age <= INFANT_AGE || age >= CENTENARIAN_AGE) {
			System.out.println("Ticket Price: 0");
		} else if (age <= CHILD_AGE || age >= SENIOR_CITIZEN_AGE) {
			System.out.println("Ticket Price: 5");
		} else {
			System.out.println("Ticket Price: 10");
		}
	}
}