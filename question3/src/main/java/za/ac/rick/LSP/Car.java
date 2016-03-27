package za.ac.rick.LSP;

/**
 * Created by Rick on 26-Mar-16.
 */
public class Car implements CarInterface{

    public String Drive(String dr)
    {
        if(dr == "move")
        {
            return "car is driving";
        }
        else return "not moving";
    }

    public int GearShiftUp(int i) {
        int gear = i + i;
        return gear;
    }

}
