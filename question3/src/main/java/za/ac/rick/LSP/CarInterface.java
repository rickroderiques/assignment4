package za.ac.rick.LSP;

/**
 * Created by Rick on 26-Mar-16.
 */
public interface CarInterface {
    public String Drive(String dr);
    public int GearShiftUp(int i);

    /** any car that is a petrol car
     can use these methods except electric cars*/
}
