package HorlogeUniv.Astres;


import java.awt.*;

public class Planete extends Astres {

    private double dureeRevolutionJours;

    public Planete(double dureeRevolutionJours, double x, double y, double rayon, Color couleur) {
        super(x, y, rayon, couleur);
        this.dureeRevolutionJours = dureeRevolutionJours;
    }

    public double getDureeRevolutionJours() {
        return dureeRevolutionJours;
    }


}
