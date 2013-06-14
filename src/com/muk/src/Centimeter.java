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

    public Centimeter(int length) {
        this.length = length;
    }

    public String toString(){
        return length + "cm";
    }

}
