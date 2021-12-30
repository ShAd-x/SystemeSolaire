package HorlogeUniv.Time;

import HorlogeUniv.Astres.Astres;
import HorlogeUniv.Astres.Planete;
import HorlogeUniv.Outils.Draw;
import java.util.List;
import java.util.Arrays;

import java.awt.*;

public class UtilisermonHorlogeUniverselle {

    public static void main(String[] args) {
        monHorlogeUniverselle horlUnivun = new monHorlogeUniverselle("\t\t1 jour s'est écoulé",2);

        Planete Mercure = new Planete(87.96);
        Planete Venus = new Planete(224.69);
        Planete Terre = new Planete(365.256);
        Planete Mars = new Planete(686.97);
        Planete Jupiter = new Planete(4332.589);
        Planete Saturne = new Planete(10759.23);
        Planete Uranus = new Planete(30685.4);
        Planete Neptune = new Planete(60216.8);

        List<Astres> systsol;

        systsol = Arrays.asList(
                Soleil,
                Mercure,
                Venus,
                Terre,
                Mars,
                Jupiter,
                Saturne,
                Uranus,
                Neptune
        );

        /*Draw gui = new Draw("Le Système solaire");
        gui.setCanvasSize(1000,1000);
        gui.setPenColor(Draw.ORANGE);
        gui.filledCircle(0.5, 0.55, 0.02);

        gui.setPenColor(Draw.BLACK);
        for(int i = 0; i < 8; i++){ gui.circle(0.5, 0.55, 0.05+(i*0.05)); }

        gui.setPenColor(Draw.LIGHT_GRAY);
        gui.filledCircle(0.55, 0.55, 0.005);

        gui.setPenColor(Draw.PINK);
        gui.filledCircle(0.60, 0.55, 0.005);

        gui.setPenColor(Draw.GREEN);
        gui.filledCircle(0.65, 0.55, 0.005);

        gui.setPenColor(Draw.RED);
        gui.filledCircle(0.70, 0.55, 0.005);

        gui.setPenColor(Draw.ORANGE);
        gui.filledCircle(0.75, 0.55, 0.005);

        gui.setPenColor(Draw.ORANGE);
        gui.filledCircle(0.80, 0.55, 0.005);

        gui.setPenColor(Draw.BOOK_LIGHT_BLUE);
        gui.filledCircle(0.85, 0.55, 0.005);

        gui.setPenColor(Draw.BOOK_BLUE);
        gui.filledCircle(0.90, 0.55, 0.005);*/

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