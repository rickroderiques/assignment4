package za.ac.cput.rick;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 23-Mar-16.
 */
public class EmployeeTest {

    @Test
    public void testIncreaseSalary() throws Exception {

            double salary = 500;
            double increase = 5;

            double expected = 525;

            Employee.setEmpSalary(salary);
            double actual = Employee.increaseSalary(increase);
            assertEquals(expected, actual, 2);

    }
}