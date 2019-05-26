package com.neuedu.test;
import java.util.Scanner;
public class zuoye9 {
    public static void main(String[] args) {
        int i = 1;
        int m = 0;
        while (i <= 200) {
            if (i % 3 == 0) {
                m += i;
                i++;
            } else {
                i++;
            }

        }
        System.out.println("3的倍数和是" + m);


    }
}