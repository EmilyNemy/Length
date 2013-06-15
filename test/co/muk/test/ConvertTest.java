package co.muk.test;

import com.muk.src.Millimeter;
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
    public void shouldConvertCentimeterToMeter(){
        Meter meter = new Meter(1);
        Centimeter centimeter = new Centimeter(100);

        assertThat(centimeter.convertToMeter(), is(meter))  ;

    }

     @Test
    public void convertMeterToMillimeter(){
         Meter meter= new Meter(1);
         Millimeter millimeter = new Millimeter(1000);

         assertThat(meter.toMillimeter(),is(millimeter));

     }

    @Test
    public void shouldConvertMillimeterToMeter(){
        Meter meter = new Meter(1);
        Millimeter millimeter = new Millimeter(1000);

        assertThat(millimeter.toMeter(),is(meter));
    }

    @Test
    public void convertCentimeterToMillimeter(){
        Millimeter millimeter = new Millimeter(10);
        Centimeter centimeter = new Centimeter(1);

        assertThat(centimeter.toMillimeter(),is(millimeter));
    }
    @Test
    public void convertMillimeterToCentimeter(){
        Centimeter centimeter = new Centimeter(1);
        Millimeter millimeter = new Millimeter(10);

        assertThat(millimeter.toCentimeter(),is(centimeter));
    }
    @Test
    public void calculateLengthInMeters(){
        Meter meter1 = new Meter(1);
        Meter meter2 = new Meter(3);
        Meter meter3 = new Meter(4);
        Meter meterResult = (meter1.add(meter3)).subtract(meter2);

        assertThat(meterResult, is(new Meter(2)));
    }
    @Test
    public void calculateLengthInCentimeters(){
        Centimeter centimeter1 = new Centimeter(7);
        Centimeter centimeter2 = new Centimeter(3);
        Centimeter centimeter3 = new Centimeter(2);

        Centimeter centimeterResult = (centimeter1.addCentimeter(centimeter2)).subtractCentimeter(centimeter3);

        assertThat(centimeterResult, is(new Centimeter(8)));

    }
    @
}
