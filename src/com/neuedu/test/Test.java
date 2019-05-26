package com.neuedu.test;

public class Test {
    public static void main(String[] args){
        System.out.println();
        String str = "123";
        for (int i = str.length();i > 0; i--) {
            System.out.println(str.subSequence(i-1, i));
        }
    }
}
