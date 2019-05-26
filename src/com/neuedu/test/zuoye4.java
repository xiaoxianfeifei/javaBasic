package com.neuedu.test;

public class zuoye4 {
    public static void main(String[] args) {
        int m=0;
      int n=0;
      for (int i=0;i<=100;i++){
          if (i%2!=0){
              m=i+m;
          }
          else{
              n=i+n;
          }
       }
        System.out.println("偶数和等于"+n);
        System.out.println("奇数和等于"+m);
    }
}
