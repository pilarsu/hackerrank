package uk.co.kika;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaStaticInitializerBlock {

    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = B>0 && H>0;
            if (!flag) try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception e) {
                System.out.print(e);
            }
    }

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
