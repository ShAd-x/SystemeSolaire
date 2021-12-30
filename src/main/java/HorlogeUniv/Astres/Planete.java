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

    public void setCoordPlaneteX(double x) {
        this.x = x;
    }

    public void setCoordPlaneteY(double y) {
        this.y = y;
    }

    public void mouvementPlanete(double x, double y, Etoile soleil) {
        double xMoving = x - soleil.x;
        double yMoving = y - soleil.y;
        double xplanete = xMoving * Math.cos(Math.toRadians(360 / this.dureeRevolutionJours)) - yMoving * Math.sin(Math.toRadians(360 / this.dureeRevolutionJours));
        double yplanete = -xMoving * Math.sin(Math.toRadians(360 / this.dureeRevolutionJours)) + yMoving * Math.cos(Math.toRadians(360 / this.dureeRevolutionJours));
        System.out.println("#########");
        System.out.println(xplanete + " " + " " + yplanete);
        this.setCoordPlaneteX(xplanete);
        this.setCoordPlaneteY(yplanete);
        System.out.println("#########");
        System.out.println(xplanete + " " + " " + yplanete);
    }
}
