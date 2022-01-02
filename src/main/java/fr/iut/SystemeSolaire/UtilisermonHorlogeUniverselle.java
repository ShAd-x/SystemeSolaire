package fr.iut.SystemeSolaire;

import fr.iut.SystemeSolaire.Astres.Etoile;
import fr.iut.SystemeSolaire.Astres.Planete;
import fr.iut.SystemeSolaire.Outils.StdDraw;
import fr.iut.SystemeSolaire.Time.monHorlogeUniverselle;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class UtilisermonHorlogeUniverselle {

    public static void main(String[] args) {

        StdDraw.setCanvasSize(900, 900);
        StdDraw.setScale(0, 1);

        Planete Mercure = new Planete(87.96, 0.55, 0.55, 0.01, Color.LIGHT_GRAY);
        Planete Venus = new Planete(224.69, 0.60, 0.55, 0.01, Color.PINK);
        Planete Terre = new Planete(365.256, 0.65, 0.55, 0.01, Color.GREEN);
        Planete Mars = new Planete(686.97, 0.70, 0.55, 0.01, Color.RED);
        Planete Jupiter = new Planete(4332.589, 0.75, 0.55, 0.01, Color.ORANGE);
        Planete Saturne = new Planete(10759.23, 0.80, 0.55, 0.01, Color.YELLOW);
        Planete Uranus = new Planete(30685.4, 0.85, 0.55, 0.01, Color.CYAN);
        Planete Neptune = new Planete(60216.8, 0.90, 0.55, 0.01, Color.BLUE);
        Etoile Soleil = new Etoile(0.5, 0.55, 0.02, Color.ORANGE);

        List<Planete> systsol;

        systsol = Arrays.asList(
                Mercure,
                Venus,
                Terre,
                Mars,
                Jupiter,
                Saturne,
                Uranus,
                Neptune
        );


        monHorlogeUniverselle horlUnivun = new monHorlogeUniverselle("\t\t2 jours se sont écoulés", (long)10, systsol, Soleil);

        Thread t1 = new Thread(horlUnivun);

        System.out.println("Début du programme");


        t1.start();


    }
}