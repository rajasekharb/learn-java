package com.brs.in;

public class GradeCalculator {
	public void calculateGrade(double gpa) {
		if (gpa > 4.5) {
			System.out.println("Grade: A");
		} else if (gpa > 3.5 && gpa <= 4.49) { 
			System.out.println("Grade: B");
		} else if (gpa > 2.5 && gpa <= 3.49) { 
			System.out.println("Grade: C");
		} else if (gpa > 2.0 && gpa <= 2.49) { 
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}
	}
}