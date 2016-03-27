package za.ac.rick.OCP;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Rick on 26-Mar-16.
 */
public class PaymentTest {


    private Payment cm = new Payment();

    @Test
    public void testPaymentMethod()
    {
        // Assert.assertEquals("card payment", cm.paymentMethod("card"));
        Assert.assertEquals("cash payment only", cm.cash());
    }

}
