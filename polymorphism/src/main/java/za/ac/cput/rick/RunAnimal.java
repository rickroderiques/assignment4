package za.ac.cput.rick;

/**
 * Created by Rick on 24-Mar-16.
 */
public class RunAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Bird("Birdy Ben", "Flying");
        System.out.print(animal1.toString());

        Animal animal2 = new Fish("Fishy Fred", "Swimming");
        System.out.print(animal2.toString());

    }
}
