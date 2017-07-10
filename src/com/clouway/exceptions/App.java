package com.clouway.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class App {

    public static void main(String[] args) {

        Interval interval1 = new Interval(30,150);
        Interval interval2 = new Interval(0,100);
        Interval interval3 = new Interval(-200, 500);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(true){

            try {
                Integer numberToCheck = new Integer(reader.readLine());
                checkNumber(interval3, numberToCheck);
                checkNumber(interval2, numberToCheck);
                checkNumber(interval1, numberToCheck);
            }
            catch (IntervalException e) {
                System.out.println(e);
            }
            catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    static void checkNumber(Interval interval, int x){
        if(interval.isWithinBoundary(x)) {
            System.out.println(x + " is within " + interval.toString() + ".");
        }
        else {
            throw new IntervalException(x + " is not within " + interval.toString() + ".");
        }
    }

}