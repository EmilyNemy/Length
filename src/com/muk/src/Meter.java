package com.muk.src;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/13/13
 * Time: 4:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class Meter {

    private final int length;

    public Meter(int length) {
        this.length = length;
    }
    @Override
    public String toString(){
        return length+"m";
    }

    public Centimeter convertToCentimeter() {
        int theValue = length * 100;
        return new Centimeter(theValue);  //To change body of created methods use File | Settings | File Templates.
    }
}
