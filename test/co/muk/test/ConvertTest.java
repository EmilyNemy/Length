package co.muk.test;

import com.muk.src.Centimeter;
import com.muk.src.Meter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/15/13
 * Time: 2:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConvertTest {

    @Test
    public void shouldConvertMeterToCentimeter(){
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);

        assertThat(meter.convertToCentimeter(), is(centimeter))  ;


    }
    @Test
    public void shouldConvertCentimterToMeter(){
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);

        assertThat(centimeter.convertToMeter(), is(meter))  ;

    }


}
