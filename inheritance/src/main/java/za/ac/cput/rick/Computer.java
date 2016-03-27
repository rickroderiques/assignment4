package za.ac.cput.rick;

/**
 * Created by Rick on 24-Mar-16.
 */
public class Computer {

    private int processorType;
    private int speed;

    public Computer()
    {
    }

    public Computer(int pType, int s)
    {
        processorType = pType;
        speed = s;
    }
    /**setters*/
    public void setProcessorType(int pType)
    {
        processorType = pType;
    }

    public void setSpeed(int s)
    {
        speed = s;
    }

    /**getters*/
    public int getProcessorType()
    {
        return processorType;
    }

    public int getSpeed()
    {
        return speed;
    }

    public String toString()
    {
        return String.format("\n Computer details \nprocessorType: %d \n speed: %d", processorType, speed);
    }
}
