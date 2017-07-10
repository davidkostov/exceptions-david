package com.clouway.exceptions;

import java.math.BigDecimal;

/**
 * @author David Kostov (david.kostov.cw@gmail.com)
 */
public class ListApp {
    public static void main(String[] args) {

        try {
            MyList test = new MyList(6);
            test.add(new Integer(200));
            test.add(new String("hello!"));
            test.add(new BigDecimal("200.21412"));
            test.add(new String("hello!"));
            test.add(new BigDecimal("200.21412"));
            test.add(new Integer(200));

            test.printAllElements();
            test.remove();
            test.printAllElements();
            test.remove();
            test.remove();
            test.printAllElements();
            test.remove();
            test.remove();
            test.remove();
            test.remove();
            test.remove();
        }
        catch(ListException e){

            System.out.println(e);

        }
    }
}
