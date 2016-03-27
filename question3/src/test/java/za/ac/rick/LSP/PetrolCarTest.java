package za.ac.rick.LSP;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Rick on 26-Mar-16.
 */
public class PetrolCarTest {



    PetrolCar pc = new PetrolCar();

    @Test
    public void testGearShiftUp()
    {
        Assert.assertEquals(2, pc.gearUp(1));
    }
}
