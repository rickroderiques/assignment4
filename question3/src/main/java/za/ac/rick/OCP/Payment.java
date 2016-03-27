package za.ac.rick.OCP;

/**
 * Created by Rick on 26-Mar-16.
 */
public class Payment implements PaymentInterface {


    /**we do not know the type of payment*/

    public String paymentMethod(String pm)
    {
        if (pm == "cash")
            return "cash payment";
        else if (pm == "card")
            return "card payment";
        else if (pm == "voucher")
            return "voucher payment";
        else
            return "no customer";
    }

}
