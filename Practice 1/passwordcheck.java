/* Password Check
* Prasad Patil 10/10/2021
*/

import java.util.*;

public class passwordcheck{
	public static void main(String[] args){
		System.out.println("Enter the password");
		
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		
		boolean a = A.equals("ABD");
		boolean b = A.equalsIgnoreCase("abd");

		if(a==false){
			if(b == true){
				System.out.println("Password incorrect. Turn on Caps lock");
			} else{
				System.out.println("Password incorrect.");
			}
		} else{
			System.out.println("Password correct. Loading..........");
		}
	}	
	
}
