/*Problem Statement 3
*Write a program that prompts the user to 
*input a positive integer. It should then 
*print the multiplication table of that number.
* Prasad Patil 10/10/2021
*/
import java.util.*;
public class PS3{
	public static void main(String[] args){
		System.out.println("Please Enter the number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.format("The table of %d is as follows: %n %n",num);
		for(int i = 1; i<=10; i++){
			int numi = num * i;
			System.out.format("%d * %d = %d %n",num,i,numi);
		}
		
	}
}