package HorlogeUniv.Astres;


import HorlogeUniv.Outils.StdDraw;

import java.awt.*;


public abstract class Astres {
    private double dureeRevolutionJours;
    private double x;
    private double y;
    private double rayon;
    private Color couleur;

    public Astres(double dureeRevolutionJours) {
        this.dureeRevolutionJours = dureeRevolutionJours;
    }

    public double getDureeRevolutionJours() {
        return dureeRevolutionJours;
    }

    public void drawSphere(double drawX, double drawY, double sphereRadius) {
    }

    public void printPlanete(Color couleur, double x, double y, double rayon){
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(couleur);
        StdDraw.filledCircle(x, y, rayon);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
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
}