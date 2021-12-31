package HorlogeUniv.Time;

import HorlogeUniv.Astres.Etoile;
import HorlogeUniv.Astres.Planete;
import HorlogeUniv.Outils.StdDraw;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class monHorlogeUniverselle implements Runnable {

    private boolean continuer;
    private final String message;
    private final long secondesParJour;
    private final Calendar date = new GregorianCalendar();
    private List<Planete> systeme_solaire;
    private Etoile soleil;

    public monHorlogeUniverselle(String message, long secondesParJour, List<Planete> systeme_solaire, Etoile soleil) {
        this.continuer = true;
        this.message = message;
        this.secondesParJour = secondesParJour;
        this.systeme_solaire = systeme_solaire;
        this.soleil = soleil;
    }

    public void setContinuer(boolean continuer){
        this.continuer = continuer;
    }

    public void run() {

        long time = 1000/(70/secondesParJour);
        //Date date = new Date(currentTimeMillis());
        while(continuer) {
            try {
                Thread.sleep(time);
                soleil.printEtoile();
                for (Planete planetes : systeme_solaire)
                {
                    planetes.printPlanete(planetes.getX(), planetes.getY(), soleil);
                    planetes.mouvementPlanete(planetes.getX(), planetes.getY(), soleil);
                }
                System.out.println(message);
                date.add(Calendar.DATE, 1);
                System.out.println(date.getTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            /*StdDraw.show();
            StdDraw.clear();*/
        }
    }
}