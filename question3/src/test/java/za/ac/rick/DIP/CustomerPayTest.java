package za.ac.rick.DIP;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Rick on 26-Mar-16.
 */
public class CustomerPayTest {

    CustomerPay c = new CustomerPay();

    @Test
    public void testPayForItems()
    {
        Assert.assertEquals("paying for items", c.payForItems());
    }
}
