package za.ac.rick.LSP;

/**
 * Created by Rick on 26-Mar-16.
 */
public class ElectricCar {

    private CarInterface ci = new Car();


    /**this violates the LSP.... even though it looks like a car and drives like a car
     * does not mean it is a car because an electric car does not have gears*/
    public int gearUp(int i)
    {
        return ci.GearShiftUp(i);
    }

}
