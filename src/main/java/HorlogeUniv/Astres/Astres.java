package HorlogeUniv.Astres;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public  abstract class Astres extends JFrame {
    private double dureeRevolutionJours;

    public Astres(double dureeRevolutionJours) {
        this.dureeRevolutionJours = dureeRevolutionJours;
    }

    public double getDureeRevolutionJours() {
        return dureeRevolutionJours;
    }

    public void drawSphere(double drawX, double drawY, double sphereRadius) {
    }

    public void drawOrbitingSphere(int timeInterval) {

        // let's just choose a bunch of values that we'll need
        double orbitX = 0.5; /* x-coordinate in orbit's center */
        double orbitY = 0.55; /* y-coordinate in orbit's center */
        double orbitRadius = 0.02;
        double orbitSpeed = Math.PI / 16; // A Finir
        double sphereRadius = 0.05;

        /*
         * based on the current time interval, we'll calculate where the sphere
         * is at on its orbit
         */
        double radian = orbitSpeed * timeInterval;
        double drawX = orbitX + orbitRadius * Math.cos(radian);
        double drawY = orbitY + orbitRadius * Math.sin(radian);

        // use whichever Draw method is provided by your API
        drawSphere(drawX, drawY, sphereRadius);
    }

    public void DrawAstre(){
        setTitle("Drawing a Circle");
        setSize(250, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRoundRect(40, 50, 90, 90, 200, 200);
    }


}