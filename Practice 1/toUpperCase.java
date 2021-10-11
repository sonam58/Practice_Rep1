/*Character and Strings
*Prasad Patil, 10/10/2021
*/

import java.lang.*;
import java.util.Scanner;

public class toUpperCase{
	public static void main(String[] args){
		System.out.println("Enter the character");
		Scanner sc = new Scanner(System.in);
		
		char A = sc.next().charAt(0);
		
		System.out.println("The upper case character is"+Character.toUpperCase(A));
		
		
	}
}