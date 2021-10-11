/*String equal methods
*Prasad Patil 10/10/2021
*/

import java.lang.*;
import java.util.*;

public class String_equal{

    public static void main(String[] args){
    
    System.out.println("Enter the input string: ");
    Scanner sc = new Scanner(System.in);
    String A = sc.nextLine();

    System.out.println(A.equals("java")); //true if A equals java including cases
    System.out.println(A.equalsIgnoreCase("Java")); // cases not checked

        System.gc();
    }
}