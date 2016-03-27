package za.ac.rick.OCP;

/**
 * Created by Rick on 26-Mar-16.
 */
public class Payment {


    /**this violates OCP as the system must open for extension and be closed for modification*/
    public String cash()
    {
        return "cash payment only";
    }

}
