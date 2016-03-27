package za.ac.rick.SRP;

/**
 * Created by Rick on 25-Mar-16.
 */
public class Employee implements Emp{

    private String notClocked;

    public Employee(String nc)
    {
        this.notClocked = nc;
    }

    /**getters*/
    public String getClockIn()
    {
        return notClocked;
    }

    public String clockedInOut(String inOut)
    {
        return notClocked = inOut;
    }

}
