package HorlogeUniv;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UtilisermonHorlogeUniverselle {

    public static void pause(long millis)
    {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        int dureeSimul = 20000;

        monHorlogeUniverselle horlUnivun = new monHorlogeUniverselle("\t\t10 jours se sont ecoulés");
        //Calendar d = new GregorianCalendar();


        Thread t1= new Thread(horlUnivun);

        System.out.println("Début du programme");
        //System.out.println("Nous commençons à la date: " + d.getTime());

        t1.start();
        pause(dureeSimul);

        horlUnivun.setContinuer(false);

        pause(1000);
        System.out.println("Fin du programme");


    }
}
