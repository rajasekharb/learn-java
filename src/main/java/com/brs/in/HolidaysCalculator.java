package com.brs.in;

public class HolidaysCalculator {
	public static void main(String[] args) {
		byte nationalHolidays = Byte.parseByte(args[0]);
		byte companyHolidays = Byte.parseByte(args[1]);
		byte totalHolidays = (byte)(nationalHolidays + companyHolidays);
		System.out.println("totalHolidays = " + totalHolidays);
	}
}