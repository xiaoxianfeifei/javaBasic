package com.neuedu.test;

import java.util.Scanner;

public class zuoye10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        if (i % 9 == 0) {
            System.out.println(i + "可以被9整除");
        } else {
            System.out.println(i + "不可以被9整除");

        }
    }
}
