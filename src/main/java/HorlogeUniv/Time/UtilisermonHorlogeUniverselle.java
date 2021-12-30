package HorlogeUniv.Time;

import HorlogeUniv.Astres.Astres;
import HorlogeUniv.Astres.Etoile;
import HorlogeUniv.Astres.Planete;
import HorlogeUniv.Outils.Draw;
import HorlogeUniv.Outils.StdDraw;

import java.util.List;
import java.util.Arrays;

import java.awt.*;

public class UtilisermonHorlogeUniverselle {

    public static void main(String[] args) {
        monHorlogeUniverselle horlUnivun = new monHorlogeUniverselle("\t\t1 jour s'est écoulé",2);

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

        Soleil.printAstres(Soleil.getX(), Soleil.getY());

        for (int i=0; i<8; i++)
        {
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.setPenRadius(0.1+(i*0.1));
            StdDraw.circle(0.5, 0.55, 0.001);

        }

        for(Planete planetes : systsol) {
            planetes.printAstres(planetes.getX(), planetes.getY());
            System.out.println(planetes.getX());
            System.out.println(planetes.getY());
            //System.out.println("-------------------");
            planetes.mouvementPlanete(planetes.getX(), planetes.getY(), Soleil);
            System.out.println(planetes.getX());
            System.out.println(planetes.getY());
            //System.out.println("-------------------");
            planetes.printAstres(planetes.getX(), planetes.getY());

        }


        /*Draw gui = new Draw("Le Système solaire");
        gui.setCanvasSize(1000,1000);
        gui.setPenColor(Draw.ORANGE);
        gui.filledCircle(0.5, 0.55, 0.02);

        gui.setPenColor(Draw.BLACK);
        for(int i = 0; i < 8; i++){ gui.circle(0.5, 0.55, 0.05+(i*0.05)); }*/


        Thread t1 = new Thread(horlUnivun);
        System.out.println("Début du programme");

        t1.start();
        pause(10000);
        horlUnivun.setContinuer(false);

        pause(1000);
        System.out.println("Fin du programme");
    }

    public static void pause(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}