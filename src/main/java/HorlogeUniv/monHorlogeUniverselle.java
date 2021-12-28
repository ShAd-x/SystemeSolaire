package HorlogeUniv;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class monHorlogeUniverselle implements Runnable {

    private boolean continuer;
    private final String message;
    private final int secondesParJour;
    private final Calendar date = new GregorianCalendar();

    public monHorlogeUniverselle(String message, int secondesParJour) {
        this.continuer = true;
        this.message = message;
        this.secondesParJour = secondesParJour;
    }

    public void setContinuer(boolean continuer){
        this.continuer = continuer;
    }

    public void run() {
        //Date date = new Date(currentTimeMillis());
        while(continuer) {
            try {
                Thread.sleep(secondesParJour * 1000L);
                System.out.println(message);
                date.add(Calendar.DATE, 1);
                System.out.println(date.getTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}