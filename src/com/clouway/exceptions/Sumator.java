package com.clouway.exceptions;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class Sumator {

    /**
     * Summs two integers
     *
     * @param a first integer
     * @param b second integer
     * @return the sum of a and b
     */
    public int sum(int a, int b){
        return a+b;
    }

    /**
     * Summs two doubles
     *
     * @param a first double
     * @param b second double
     * @return the sum of a and b
     */
    public double sum(double a, double b){
        return a+b;
    }

    /**
     * Summs two BigIntegers
     *
     * @param a first BigInteger
     * @param b second BigInteger
     * @return the sum of a and b
     */
    public BigInteger sum(BigInteger a, BigInteger b){
        return a.add(b);
    }

    /**
     * Summs two BigDecimals
     *
     * @param a first BigDecimal
     * @param b second BigDecimal
     * @return the sum of a and b
     */
    public BigDecimal sum(BigDecimal a, BigDecimal b){
        return a.add(b);
    }

    /**
     * Checks if two strings have only digits in them and
     * if they do it concatenates them and returns the result, if they
     * have characters other than digits it throws a custom exception
     *
     * @param a the first string
     * @param b the second string
     * @return the concatenated string
     */
    public String sum(String a, String b) {

        try {
            BigDecimal str1 = new BigDecimal(a);
            BigDecimal str2 = new BigDecimal(b);
            str1 = str1.add(str2);
            return str1.toString();
        }
        catch(NumberFormatException exc){
            throw new SumatorException("No characters other than digits allowed!");
        }

    }

}
