package co.muk.src;

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
}
