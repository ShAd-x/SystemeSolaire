package HorlogeUniv.Astres;


import java.awt.*;

public class Etoile extends Astres {


    public Etoile(double dureeRevolutionJours, double x, double y, double rayon, Color couleur) {
        super(dureeRevolutionJours, x, y, rayon, couleur);
    }

    @Override
    public void printAstres(Color couleur, double x, double y, double rayon) {
        super.printAstres(couleur, x, y, rayon);
    }
}
