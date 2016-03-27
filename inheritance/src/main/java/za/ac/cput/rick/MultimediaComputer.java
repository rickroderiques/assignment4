package za.ac.cput.rick;

/**
 * Created by Rick on 24-Mar-16.
 */
public class MultimediaComputer extends Computer {
    private int cdRomSpeed;
    public MultimediaComputer()
    {
    }

    public MultimediaComputer( int pType, int speed, int rSpeed) //constructor overloading
    {
        super(pType, speed);
        cdRomSpeed = rSpeed;
    }

    /**sets and gets*/
    public void setCdRomSpeed(int rSpeed)
    {
        cdRomSpeed = rSpeed;
    }

    public int getCdRomSpeed()
    {
        return cdRomSpeed;
    }

    public String toString()
    {
        return String.format
                ("\n\n MultiMedia PC " +
                        "\nProcessor: " + getProcessorType() +
                        "\nSpeed: " + getSpeed() +
                        "\n cdRomSpeed: " + cdRomSpeed);
    }
}
