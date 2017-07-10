package com.clouway.exceptions;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class MyList {


    private Object[] list;
    private int index;

    public MyList(int size){
        list = new Object[size];
        index=-1;
    }

    /**
     * Adds a new element to the list
     *
     * @param elementData the new element
     */
    public void add(Object elementData) throws ArrayIndexOutOfBoundsException{

        if (index == list.length-1){
            throw new ListException("The list is full, you cannot add anymore elements!");
        }
        list[++index] = elementData;

    }

    /**
     * Removes the last(bottom) element of the list
     */
    public void remove(){

        if (index < 0){
            throw new ListException("The list is empty, you cannot remove elements from it!");
        }
        list[index--] = null;

    }

    /**
     * Gets the entire list into a string
     * @return the string(that is the list)
     */
    public void printAllElements(){

        for(int i=0; i<list.length; i++){

            if(list[i]!=null){
                System.out.print(list[i]+" ");
            }

        }

        System.out.println();

    }

}
