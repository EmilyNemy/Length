package co.muk.test;

import com.muk.src.Centimeter;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/15/13
 * Time: 1:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class CentimeterTest {
    @Test
    public void representCentimeters(){
        Centimeter centimeter = new Centimeter(6);

        assertThat(centimeter.toString(), is("6cm"));
    }
}
