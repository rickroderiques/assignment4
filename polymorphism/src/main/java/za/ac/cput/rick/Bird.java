package za.ac.cput.rick;

/**
 * Created by Rick on 24-Mar-16.
 */
public class Bird extends Animal{

    String move;

    public Bird()
    {}
    public Bird(String nm, String mv)
    {
        super(nm);
        setMove(mv);
    }

    public void setMove(String mv) {
        move = mv;
    }

    public String toString() {
        return super.toString() + " is " + move;
    }
}
