package com.metanit;

public class TestIsPalindrom {
    public static boolean isPalindrom(int number) {
        String str = Integer.toString(number);
        String strReverse = new StringBuilder(str).reverse().toString();
        return str.equals(strReverse);
    }

}
