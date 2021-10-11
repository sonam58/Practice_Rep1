/* How to check whether character
*is upper case or lower case
*Prasad Patil, 10/10/2021
*/
import java.util.Scanner;
import java.lang.Character;

class HT_upOrLowCase{
	
	public static void main(String[] args){
		System.out.println("Enter the characeter to check");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(Character.isLowerCase(ch)) {
			System.out.println(ch + "is Lower Case.");
		} else if (Character.isUpperCase(ch)){
			System.out.println(ch+"is Upper Case.");
		} else if (Character.isDigit(ch)){
			System.out.println(ch+"is Digit.");
		} else {
			System.out.println("Cannot specify" + ch);
		}
		
		
	}
}