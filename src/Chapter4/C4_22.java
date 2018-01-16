package Chapter4;
import java.util.Scanner;
/**
 * Program to find if string 1 is a substring of string 2
 *
 * @author Kash Conder
 */

public class C4_22 {
/**
 * Main Method
 *
 * @param args arguments from command line prompt
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Prompt user to input string s1 and then s2
        System.out.print(" Enter string s1: ");
        String s1 = input.next();
        System.out.print(" Enter string s2: ");
        String s2 = input.next();

        //See if s1 contains anything from s2
        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }

}
