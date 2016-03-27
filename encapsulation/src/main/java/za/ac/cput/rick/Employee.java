package za.ac.cput.rick;

/**
 * Created by Rick on 23-Mar-16.
 */
public class Employee {

    private String empName;
    private String empSurname;
    private String empNumber;
    private static double empSalary;

    /**set methods*/

    public Employee() /** default constructor*/
    {
    }

    public Employee(String n, String sn, String num)
    {
        empName = n;
        empSurname = sn;
        empNumber = num;
    }

    public void setEmpName(String n)
    {
        empName = n;
    }

    public void setEmpSurname(String sn)
    {
        empSurname = sn;
    }

    public void setEmpNumber(String num)
    {
        empNumber = num;
    }

    public static void setEmpSalary(double sal)
    {
        empSalary = sal;
    }

    /** get methods */
    public String getEmpName()
    {
        return empName;
    }

    public String getEmpSurname()
    {
        return empSurname;
    }

    public String getEmpNumber()
    {
        return empNumber;
    }

    public double getSalary()
    {
        return empSalary;
    }

    /**calculation increase method*/
    public static double increaseSalary(double percent)
    {
        empSalary = empSalary * (1+(percent/100));
        return empSalary;
    }

    public String toString()
    {
        return String.format("\nName: %s \n Number: %s \n Salary: %.2f ", empName, empNumber, empSalary);
    }
}
