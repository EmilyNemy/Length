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
        int result = length*100;
        return new Centimeter(result);  //To change body of created methods use File | Settings | File Templates.
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Meter meter = (Meter) o;

        if (length != meter.length) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return length;
    }

    public Millimeter toMillimeter() {
        return new Millimeter(length*1000);

    }

    public Meter add(Meter meter) {
        return new Meter(length + meter.length);
    }

    public Meter subtract(Meter meter) {
        return new Meter(length - meter.length);
    }
}
