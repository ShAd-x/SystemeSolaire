package fr.iut.SystemeSolaire.Time;

import fr.iut.SystemeSolaire.Astres.Etoile;
import fr.iut.SystemeSolaire.Astres.Planete;
import fr.iut.SystemeSolaire.Outils.StdDraw;

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
        int cpt=0;
        long time = 1000/(10/secondesParJour);
        //Date date = new Date(currentTimeMillis());
        while(continuer) {
            try {



                soleil.print();
                soleil.printCircle();
                for (Planete planetes : systeme_solaire)
                {
                    planetes.printPlanete(planetes.getX(), planetes.getY(), soleil);
                    planetes.mouvementPlanete(planetes.getX(), planetes.getY(), soleil);
                }
                StdDraw.show();
                Thread.sleep(time);
                System.out.println(message);
                date.add(Calendar.DATE, 2);
                System.out.println(date.getTime());
                cpt+=2;
                System.out.println(cpt);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            StdDraw.clear();
        }
    }
}