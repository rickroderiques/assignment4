package za.ac.cput.rick;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 24-Mar-16.
 */
public class AnimalTest {

    Animal ani1, ani2;
    @Test
    public void testMove() throws Exception {

        ani1 = new Fish();
        ani2 = new Bird();
        ani1.setName("Fishy");
        String object1 = ani1.getName();
        ani2.setName("Birdy");
        String object2 = ani1.getName();

        assertSame(object1, object2);
    }

}