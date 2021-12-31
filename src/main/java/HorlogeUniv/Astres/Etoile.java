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

}
