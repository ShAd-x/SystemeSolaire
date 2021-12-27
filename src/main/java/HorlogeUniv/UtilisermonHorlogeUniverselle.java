package HorlogeUniv;

import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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


        Thread t1= new Thread(horlUnivun);

        System.out.println("Début du programme");

        t1.start();
        pause(dureeSimul);

        horlUnivun.setContinuer(false);

        pause(1000);
        System.out.println("Fin du programme");
    }
}
