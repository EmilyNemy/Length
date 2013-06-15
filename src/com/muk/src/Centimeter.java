package com.muk.src;

import org.testng.annotations.Test;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/15/13
 * Time: 1:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class Centimeter {
    private int length;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Centimeter that = (Centimeter) o;

        if (length != that.length) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return length;
    }

    public Centimeter(int length) {
        this.length = length;

    }

    public String toString(){
        return length + "cm";
    }

    public Meter convertToMeter() {
        return new Meter(length/100);  //To change body of created methods use File | Settings | File Templates.
    }
}
