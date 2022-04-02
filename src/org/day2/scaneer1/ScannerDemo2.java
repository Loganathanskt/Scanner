/*	QUESTION 2:
		-------------
		Description: Using Scanner class get the below details
		             studentId
		             studentName
		             Mark1
		             Mark2
		             Mark3
		             Mark4
		             Mark5
		           :Find the total and average of marks*/
package org.day2.scaneer1;

import java.util.Scanner;

public class ScannerDemo2 {
	
	public static void main(String[] args) {
		Scanner scnObj = new Scanner(System.in);
		System.out.println("Enter studentId : ");
		int studentId = scnObj.nextInt();
		
		scnObj.nextLine();
		
		System.out.println("Enter studentName : ");
		String studentName = scnObj.nextLine().toUpperCase();
		
		System.out.println("Enter Mark1 : ");
		int Mark1 = scnObj.nextInt();
		scnObj.nextLine();
		
		System.out.println("Enter Mark2 : ");
		int Mark2 = scnObj.nextInt();
		scnObj.nextLine();
		
		System.out.println("Enter Mark3 : ");
		int Mark3 = scnObj.nextInt();
		scnObj.nextLine();
		
		System.out.println("Enter Mark4 : ");
		int Mark4 = scnObj.nextInt();
		scnObj.nextLine();
		
		System.out.println("Enter Mark5 : ");
		int Mark5 = scnObj.nextInt();
		scnObj.nextLine();
		
		int total = Mark1+Mark2+Mark3+Mark4+Mark5;
		double avg = total/5;
		
		System.out.println("The Total Mark of "+studentName+" is : "+total);
		System.out.println("The Average Mark scored by "+studentName+" is : "+avg);
		
	}

}
