package com.clouway.exceptions;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class SumatorApp {

    public static void main(String[] args) {

        Sumator sumator = new Sumator();

        String testA1 = "1", testA2 = "2a";
        String testB1 = "1", testB2 = "2";
        try {
            System.out.println(sumator.sum(testB1, testB2));
            System.out.println(sumator.sum(testA1, testA2));
        }
        catch(SumatorException se){
            System.out.println(se);
        }

    }

}
