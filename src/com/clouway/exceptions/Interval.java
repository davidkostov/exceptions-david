package com.clouway.exceptions;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class Interval {

    private int leftBoundary, rightBoundary;

    public Interval(int a, int b){
        leftBoundary = a;
        rightBoundary = b;
    }

    public String toString(){
        return "["+leftBoundary+", "+rightBoundary+"]";
    }

    public boolean isWithinBoundary(int x){

        if(x >= leftBoundary && x <= rightBoundary)
            return true;
        else
            return false;

    }

}
