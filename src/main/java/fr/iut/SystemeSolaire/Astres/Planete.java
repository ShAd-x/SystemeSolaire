package fr.iut.SystemeSolaire.Astres;


import java.awt.*;

public class Planete extends Astres {

    private double dureeRevolutionJours;

    public Planete(double dureeRevolutionJours, double x, double y, double rayon, Color couleur) {
        super(x, y, rayon, couleur);
        this.dureeRevolutionJours = dureeRevolutionJours;
        this.x = x;
        this.y = y;
        this.rayon = rayon;
        this.couleur = couleur;
    }

    public void setCoordPlaneteX(double x) {
        this.x = x;
    }

    public void setCoordPlaneteY(double y) {
        this.y = y;
    }

    public void printPlanete(double x, double y, Etoile soleil) {
        super.print();
    }


    public void mouvementPlanete(double x, double y, Etoile soleil) {


        double xMoving = x - soleil.x;
        double yMoving = y - soleil.y;
        double xplanete = xMoving * Math.cos(Math.toRadians(360/this.dureeRevolutionJours*2)) - yMoving * Math.sin(Math.toRadians(360/this.dureeRevolutionJours*2));
        double yplanete = xMoving * Math.sin(Math.toRadians(360/this.dureeRevolutionJours*2)) + yMoving * Math.cos(Math.toRadians(360/this.dureeRevolutionJours*2));
        this.setCoordPlaneteX(soleil.getX() + xplanete);
        this.setCoordPlaneteY(soleil.getY() + yplanete);
    }
}
