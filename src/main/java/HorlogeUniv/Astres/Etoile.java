package HorlogeUniv.Astres;


import java.awt.*;

public class Etoile extends Astres {


    public Etoile(double x, double y, double rayon, Color couleur) {
        super(x, y, rayon, couleur);
    }

    public void printAstres(Color couleur, double x, double y, double rayon) {
        super.printAstres(x, y);
    }
}
