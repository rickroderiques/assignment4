package za.ac.rick.LSP;

/**
 * Created by Rick on 26-Mar-16.
 */
public class PetrolCar {

    private CarInterface ci = new Car();


    public int gearUp(int i)
    {
        return ci.GearShiftUp(i);
    }

}
