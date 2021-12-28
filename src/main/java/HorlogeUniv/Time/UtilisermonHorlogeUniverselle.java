package HorlogeUniv.Time;

import HorlogeUniv.Outils.Draw;

public class UtilisermonHorlogeUniverselle {

    public static void main(String[] args) {
        monHorlogeUniverselle horlUnivun = new monHorlogeUniverselle("\t\t1 jour s'est écoulé",2);

        Draw gui = new Draw("Le Système solaire");
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
        gui.filledCircle(0.90, 0.55, 0.005);

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