package uk.co.kika;

import java.util.Scanner;

/**
 * There are three lines of output:
 * For the first line, sum the lengths of and .
 * For the second line, write Yes if is lexicographically greater than otherwise print No instead.
 * For the third line, capitalize the first letter in both and and print them on a single line, separated by a space.
 */
public class JavaStringIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        boolean isLexicographicallyGreater = false;
        for (int i = 0; i < A.length(); i++) {
            if (A.toLowerCase().charAt(i) > B.toLowerCase().charAt(i)) {
                isLexicographicallyGreater = true;
            } else if (A.charAt(i) < B.charAt(i)) {
                break;
            }
        }
        System.out.println(isLexicographicallyGreater?"Yes":"No");
        String aCapitalise = A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
        String bCapitalise = B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();
        System.out.println(aCapitalise + " " + bCapitalise);
    }
}
