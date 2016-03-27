package za.ac.cput.rick;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Rick on 24-Mar-16.
 */
public class MultimediaComputerTest {

    @Test
    public void testSameObjects() throws Exception {


        Computer c = new Computer();
        c.setProcessorType(32);
        int object1 = c.getProcessorType();

        MultimediaComputer m = new MultimediaComputer();
        m.setProcessorType(64);   /**gets method from computer class*/
        int object2 = m.getProcessorType();


        assertNotSame(object1, object2);
        /** not the same object yet reusing the same method*/

    }
}