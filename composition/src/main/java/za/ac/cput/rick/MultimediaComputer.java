package za.ac.cput.rick;

/**
 * Created by Rick on 24-Mar-16.
 */
public class MultimediaComputer {
    private int cdRomSpeed;
    private Computer processorType;
    private Computer speed;


    public MultimediaComputer()
    {
    }

    public MultimediaComputer( Computer pType, Computer speed, int rSpeed) //constructor overloading
    {
        processorType = pType;
        this.speed = speed;
        cdRomSpeed = rSpeed;
    }

    public void setCdRomSpeed(int rSpeed)
    {
        cdRomSpeed = rSpeed;
    }


    public String toString()
    {
        return String.format
                ("\n\n MultiMedia PC " +
                        "\nProcessor: " + processorType +
                        "\nSpeed: " + speed +
                        "\n cdRomSpeed: " + cdRomSpeed);
    }

}
