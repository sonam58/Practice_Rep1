/*
*This program is for
*getting the years into days
* prasad patil, 7 October 2021
*/

import java.util.Scanner;

public class GetUserInput{
	public static void main(String[] args){
		Scanner scanR = new Scanner(System.in);
		System.out.println("Please Enter your age in Years");
		int age = scanR.nextInt();
		
		int ageInDays = age * 365; 
		System.out.println("The age of user is: " +ageInDays);
	}
}