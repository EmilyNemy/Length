package com.muk.src;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/15/13
 * Time: 2:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class Millimeter {
    private final int length;

    public Millimeter(int length) {
        this.length = length;
    }

    public String toString(){
        return length +"mm";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Millimeter that = (Millimeter) o;

        if (length != that.length) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return length;
    }

    public Meter toMeter() {
        return new Meter(length/1000) ;  //To change body of created methods use File | Settings | File Templates.
    }

    public Centimeter toCentimeter() {
        return new Centimeter(length/10);  //To change body of created methods use File | Settings | File Templates.
    }
}
