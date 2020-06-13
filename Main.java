package com.metanit;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of numbers: ");
        int num = in.nextInt();
        System.out.print("Input  numbers: ");
        int nums[]= new int[num];
        for (int i = 0; i < num; i++){
            nums[i]= in.nextInt();
            if(TestIsPalindrom.isPalindrom(nums[i]))
            System.out.println( "Palindrom number: " + nums[i]);
        }
        in.close(); }
}


