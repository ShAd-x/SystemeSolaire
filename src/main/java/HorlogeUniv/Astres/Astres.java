package HorlogeUniv.Astres;


import HorlogeUniv.Outils.StdDraw;

import java.awt.*;


public abstract class Astres {

    protected double x;
    protected double y;
    protected double rayon;
    protected Color couleur;

    public Astres(double x, double y, double rayon, Color couleur) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
        this.couleur = couleur;
    }

    public void print()
    {
        StdDraw.setPenRadius(0.05);
        StdDraw.setPenColor(couleur);
        StdDraw.filledCircle(x, y, rayon);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}