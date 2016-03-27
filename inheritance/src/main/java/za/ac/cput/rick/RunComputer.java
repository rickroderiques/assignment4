package za.ac.cput.rick;

/**
 * Created by Rick on 24-Mar-16.
 */
import javax.swing.JOptionPane;

public class RunComputer {

    public static void main(String[] args) {

        int processorType, speed, mcSpeed;

        Computer c = new Computer();
        c.setProcessorType(64);
        c.setSpeed(2); //Ram

        processorType = Integer.parseInt(JOptionPane.showInputDialog("please enter the Multi Media processor Type "));
        speed = Integer.parseInt(JOptionPane.showInputDialog("please enter the Multi Media Speed "));
        mcSpeed = Integer.parseInt(JOptionPane.showInputDialog("please enter the cd Rom Speed "));

        MultimediaComputer mc = new MultimediaComputer(processorType, speed, mcSpeed);

        JOptionPane.showMessageDialog(null,c.toString() + mc.toString());
    }
}
