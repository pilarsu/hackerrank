package uk.co.kika;

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {

    static class Result {

        /*
         * Complete the 'fizzBuzz' function below.
         *
         * The function accepts INTEGER n as parameter.
         */

        public static void fizzBuzz(int n) {
            int i = 1;
            while (i != n+1) {
                if ((i%3==0) && (i%5==0)) {
                    System.out.println("FizzBuzz");
                } else if ((i%3==0) && (i%5!=0)) {
                    System.out.println("Fizz");
                } else if ((i%5==0) && (i%3!=0)) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}
