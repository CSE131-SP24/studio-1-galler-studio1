package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a year of your choice to determine if it is a leap year or not.");
		int year = in.nextInt();
		
		boolean divBy4 = (year % 4 == 0);
		boolean divBy100 = (year % 100 == 0);
		boolean divBy400 =  (year % 400 == 0);

		boolean result = divBy400 || (divBy4 && !divBy100);
		
		System.out.println(year + " is a leap year: " + result);
		//2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048
	}

}
