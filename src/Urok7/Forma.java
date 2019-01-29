package Urok7;

import javax.swing.*;
import java.awt.*;

public class Forma extends  JFrame{
    private JPanel panel;
    public Forma() {
        setTitle("Cat eat");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(350, 500);
        panel = new JPanel();
        panel.setLayout(new GridLayout(8, 1));
        setVisible(true);
    }
    public void paint(CatG catG) {
        panel.add().
    }
}
