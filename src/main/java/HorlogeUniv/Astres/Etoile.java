package HorlogeUniv.Astres;


import HorlogeUniv.Outils.StdDraw;

import java.awt.*;

public class Etoile extends Astres {


    public Etoile(double x, double y, double rayon, Color couleur) {
        super(x, y, rayon, couleur);
    }

    public void printEtoile() {
        super.print();
    }

    public void printCircle() {
        double rad = 0.05;
        StdDraw.setPenColor(Color.BLACK);
        StdDraw.setPenRadius(0.001);
        for (int i = 0; i < 8; i++)
        {
            StdDraw.circle(x, y, rad + (i*rad));
        }

    }

}
