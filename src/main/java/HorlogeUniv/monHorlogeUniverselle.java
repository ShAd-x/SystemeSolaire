package HorlogeUniv;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class monHorlogeUniverselle implements Runnable{

    private boolean continuer;
    private String message;
    private Calendar date = new GregorianCalendar();

    public monHorlogeUniverselle(String message)
    {
        this.continuer = true;
        this.message = message;
    }

    public void setContinuer(boolean continuer){
        this.continuer = continuer;
    }

    public void run()
    {
        while(continuer) {

            try {
                Thread.sleep(5000);
                System.out.println(message);
                date.add(Calendar.DATE, 10);
                System.out.println(date.getTime());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
