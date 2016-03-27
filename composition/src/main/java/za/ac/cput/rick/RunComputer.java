package za.ac.cput.rick;

import javax.swing.*;

/**
 * Created by Rick on 24-Mar-16.
 */
public class RunComputer {
    public static void main(String[] args) {

        Computer type = new Computer();
        type.setProcessorType(64);
        Computer speed = new Computer();
        speed.setSpeed(8); //Ram

        MultimediaComputer mc = new MultimediaComputer(type, speed, 30);

        JOptionPane.showMessageDialog(null, mc);
    }
}
