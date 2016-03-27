package za.ac.cput.rick;

/**
 * Created by Rick on 23-Mar-16.
 */

public class RunEmployee {
    public static void main(String[] args) {


        Employee emp1 = new Employee();
        Employee emp2 = new Employee("Mikhail", "Hathey", "0302");


        emp1.setEmpName("Rick");
        emp1.setEmpNumber("4068");
        emp1.setEmpSalary(3500);
        System.out.print(emp1.toString());

        emp2.setEmpSalary(4250);
        emp2.increaseSalary(15);
        System.out.print(emp2.toString());
    }
}
