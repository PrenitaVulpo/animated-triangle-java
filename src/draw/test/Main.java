package draw.test;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        JFrame frame = new JFrame();

        frame.add(t);
        frame.setVisible(true);
        frame.setSize(600,400);
        frame.setBackground(Color.WHITE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Triângulo");
    }
}
