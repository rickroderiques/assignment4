package za.ac.rick.OCP;

/**
 * Created by Rick on 26-Mar-16.
 */
public class Customer{

    private PaymentInterface pi = new Payment();
    // i can then create each object of different payments
    //call the method needed where each style will have its own
    //if statement to what it must do
    //private PaymentInterface cp = new CardPayment();
    // type of card


    public String payment(String pm)
    {
        return pi.paymentMethod(pm);

        // if (pm == "card") {cp.paymentMethod(pm)}
    }
}
