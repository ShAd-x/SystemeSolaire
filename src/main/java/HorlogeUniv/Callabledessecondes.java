/*package HorlogeUniv;

import fr.upjv.Decouvertemultithreading.Outils;

import java.util.concurrent.Callable;

public class Callabledessecondes implements Callable<Integer> {

    private int secondes;

    public Callabledessecondes(int secondes){
        this.secondes = secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    @Override
    public Integer call() throws Exception {

        for (int i=0; i <= secondes; i++)
        {
            System.out.println(i);
            Outils.pause(1000);
        }
        System.out.println("Au final " + secondes + " se sont ecoules");
        return secondes;
    }
}*/
