package com.neuedu.test;
import java.util.Scanner;
public class zuoye2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int i = input.nextInt();
        if (i>=90){
            System.out.println("A");
        }
        else if (i<=89&&i>=60){
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }
    }
}
