import java.util.ArrayList;

public class Tableau {
    public static void alea2Thread(double[] tab) throws InterruptedException {
        Long time;
        time = System.currentTimeMillis();
        Thread c1 = new CalculAlea(tab, 0, tab.length/2);
        Thread c2 = new CalculAlea(tab, tab.length/2-1, tab.length);
        c1.start();
        c2.start();
        c1.join();
        c2.join();
        System.out.println("Temps d'éxecution avec 2 threads: " + (System.currentTimeMillis() - time) + " ms");
    }

    public static void alea(double[] tab, int nbThread) throws InterruptedException {
        int debut;
        debut = 0;

        ArrayList<Thread> listeThread = new ArrayList<Thread>();

        int longueur;
        longueur = (int) Math.floor(tab.length / nbThread);
        Long time;
        Thread t;
        time = System.currentTimeMillis();
        for(int i = 0; i < nbThread; i++){
            t = new CalculAlea(tab, debut, debut+longueur);
            t.start();
            listeThread.add(t);
            debut += longueur;
        }
        t = new CalculAlea(tab, debut, tab.length);
        t.start();
        for(Thread thread : listeThread){
            t.join();
        }
        System.out.println("Temps d'éxecution "+nbThread + " threads: " + (System.currentTimeMillis() - time) + " ms.");
    }
}
