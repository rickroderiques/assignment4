package za.ac.rick.DIP;

/**
 * Created by Rick on 26-Mar-16.
 */
public class CustomerPay {
    Customers cus = new Customers();
    public String payingItems()
    {
        return cus.payForItems();
    }

    /**violating the DIP design i've NOT made it OCP compliant*/

}
