package co.muk.test;

import com.muk.src.Meter;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: emily
 * Date: 6/13/13
 * Time: 4:08 AM
 * To change this template use File | Settings | File Templates.
 */
public class MeterTest {
    @Test
    public void representMeters(){
        Meter meter = new Meter(6);

        assertThat(meter.toString(), is("6m"));
    }


}
