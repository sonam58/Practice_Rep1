/* Math Functions perimeter and area
*Prasad Patil 10/10/21
*/

import java.util.Scanner;
import java.lang.*;

public class Mathfunctions1{
	public static void main(String[] args){
		
		System.out.println("Enter the radius of circle :");
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		double a = Math.PI * r * r;
		double p = 2* Math.PI * r;
		
			System.out.format("The area circle with radius %d is %.2f and perimeter is %.2f", r, a, p);
			
		
	}
}
