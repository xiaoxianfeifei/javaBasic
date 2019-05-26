package com.neuedu.test;
import java.util.Scanner;
public class zuoye8 {
    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
        int i = input.nextInt();
        if (i%4==0&&i%100!=0){
            System.out.println(i+"是闰年");
        }
        else if (i%400==0){
            System.out.println(i+"是世纪闰年");
        }
        else {
            System.out.println(i+"是平年");
        }
    }
}
