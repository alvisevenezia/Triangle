package fr.alvisevenezia;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class TrianglePanel extends JPanel {

    private ArrayList<Coordonnees>coordonneesList;

    public TrianglePanel() {

        coordonneesList = new ArrayList<>();
        initializeCoordonnées(GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds().getSize(),10);
    }

    public void initializeCoordonnées(Dimension Bounds,int nbr){

        Random r = new Random();
        int maxX = Bounds.width;
        int maxY = Bounds.height;
        Coordonnees coordonnees;

        for(int i = nbr;i> 0;i--){

            coordonnees = new Coordonnees(r.nextInt(maxX),r.nextInt(maxY));
            coordonneesList.add(coordonnees);
        }

    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);

       /* for(int i = 0;i< coordonneesList.size();i++){

            g.setColor(Color.RED);
            g.fillOval(coordonneesList.get(i).getX(),coordonneesList.get(i).getY(),10,10);

        }*/
        setBackground(Color.YELLOW);


    }
}
