package Urok7;

import javax.swing.*;
import java.awt.*;

public class Forma extends  JFrame{
    public Forma() {
        setTitle("Cat eat");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(350, 500);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1));

        setVisible(true);
    }
}
