package HorlogeUniv;

public class UtilisermonHorlogeUniverselle {

    public static void main(String[] args) {
        monHorlogeUniverselle horlUnivun = new monHorlogeUniverselle("\t\t1 jour s'est écoulé",2);

        Thread t1= new Thread(horlUnivun);
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