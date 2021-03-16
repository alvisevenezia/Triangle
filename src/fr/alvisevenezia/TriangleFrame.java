package fr.alvisevenezia;

import javax.swing.*;
import java.awt.*;

public class TriangleFrame {

    public TrianglePanel trianglePanel;
    public JFrame jFrame;

    public TriangleFrame() {

        jFrame = new JFrame();
        trianglePanel = new TrianglePanel();
        openWindow();

    }

    public void refresh(){


        jFrame.repaint();

    }

    public void openWindow(){

        jFrame.setName("Triangle");
        jFrame.add(trianglePanel);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize());


    }
}
