package za.ac.rick.SRP;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

/**
 * Created by Rick on 25-Mar-16.
 */
public class EmployeeTest {

    /**all employee are not clocked each day*/
    private Employee emp = new Employee("no");

    /**when arrive at work and back from lunch*/
    private Employee emp1 = new Employee("in");

    /**clocked to go on lunch*/
    private Employee emp2 = new Employee("out");


    @Test
    public void testClockin()
    {
        Assert.assertSame("no", emp.getClockIn());
    }

    @Test
    public void testClocked()
    {
        Assert.assertNotSame("in", emp2.clockedInOut("out"));
    }
}
