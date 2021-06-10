package com.tdd.tddlab.converters;

public class Converter {

    public int fahrenheit2Celsius(int fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    public boolean isPalindrome(String word) {
        if(word.trim().equals(""))
            return false;

        String inverse = new StringBuffer(word).reverse().toString();
        if(word.equalsIgnoreCase(inverse))
            return true;

        return false;
    }
}
