package za.ac.cput.rick;

/**
 * Created by Rick on 24-Mar-16.
 */
public class Animal {

    private String name;

    public Animal()
    {}

    public Animal(String name)
    {
        setName(name);
    }

    public void setName(String nm)
    {
        name = nm;
    }

    public String getName()
    {
        return name;
    }

    public String toString()  {
        return "\nname is " + name;
    }
}
