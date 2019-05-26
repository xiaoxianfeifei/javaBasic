package com.neuedu.test;
import java.util.Scanner;
public class zuoye7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int i = input.nextInt();
        int a = i/10000;
        int b = i/1000%10;
        int c = i/100%10;
        int d = i/10%10;
        int e = i%10;
        if (a==e&&b==d){
            System.out.println(i+"为回文数");
        }
        else {
            System.out.println(i+"不是回文数");
        }
    }
}
