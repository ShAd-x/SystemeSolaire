package HorlogeUniv;

public class monHorlogeUniverselle implements Runnable{

    private boolean continuer;
    private String message;

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
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
