package org.example.finalStatic;

import javax.swing.*;

public class finalExample {
    //Final variables are constants (Should be named in CAPS)
    final String NAME_PROD;
    final Double PRICE;
    final String CATEGORY;
    static final String EXAMPLE;//uninitialized static final variable can only be initialized in a static block
    //blank final variable must be initialized in the constructor (cannot be final)
    public finalExample(String NAME_PROD, Double PRICE, String CATEGORY) {
        this.NAME_PROD = NAME_PROD;
        this.PRICE = PRICE;
        this.CATEGORY = CATEGORY;
    }
    static {
        EXAMPLE="This final belongs to the class";
    }
    //

    //Final method (it can be called and inherited but not overridden)
    final void demo(){
        JOptionPane.showMessageDialog(null, "This is a final method you, can't change it");
    }

    //Final class (it's a normal class but cannot be inherited)
    final class Example{
        void printExample(){
            JOptionPane.showMessageDialog(null, "Final class ");
        }
    }
    Example finClass = new Example();
    void showFinalClass() {
        finClass.printExample();
    }

    //(To remember) All variables in an interface are final
}
