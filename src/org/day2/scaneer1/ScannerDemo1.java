/*	QUESTION 1:
		------------
		Description: Using Scanner class get the below details
		             empId
		             empName
		             empEmail
		             empPhoneno
		             empSalary
		             empGender
		             empCity*/
package org.day2.scaneer1;
import java.util.Scanner;

public class ScannerDemo1 {


	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scnObj = new Scanner(System.in);
		System.out.println("Emter empId: ");
		int empId = scnObj.nextInt();
		scnObj.nextLine();
		
		System.out.println("Emter empName: ");
		String empName = scnObj.next();
				
		System.out.println("Emter empEmail: ");
		String empEmail = scnObj.next();
				
		System.out.println("Emter empPhoneno: ");
		long empPhoneno = scnObj.nextLong();
		
		System.out.println("Emter empSalary: ");
		double empSalary = scnObj.nextDouble();	
		scnObj.nextLine();
		System.out.println("Emter empGender: ");
		String empGender = scnObj.next();
		
		System.out.println("Emter empCity: ");
		String empCity = scnObj.next();
		
		System.out.println("empId is: "+empId);
		System.out.println("empName is: "+empName);
		System.out.println("empEmail is: "+empEmail);
		System.out.println("empEmail is: "+empPhoneno);
		System.out.println("empSalary is: "+empSalary);
		System.out.println("empSalary is: "+empGender);
		System.out.println("empCity is: "+empCity);
	}

}
