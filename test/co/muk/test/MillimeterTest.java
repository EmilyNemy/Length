package co.muk.test;

import co.muk.src.Millimeter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/15/13
 * Time: 1:58 AM
 * To change this template use File | Settings | File Templates.
 */
public class MillimeterTest {

    @Test
    public void representMillimeters(){
        Millimeter millimeter = new Millimeter(6);

        assertThat(millimeter.toString(),is("6mm"));
    }
}
