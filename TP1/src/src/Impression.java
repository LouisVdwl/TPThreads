public class Impression implements Runnable  {
    private String nom;
    private int nbPages;
    private static Object mutex = new Object();

    public Impression(String nom, int nbPages){
        this.nom = nom;
        this.nbPages = nbPages;
    }


    @Override
    public void run() {
        synchronized (mutex) {
            for(int i = 1; i <= this.nbPages; i++){
                System.out.println("Nom du document: " + this.nom + ". Page N°" + i + ".");
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) { }
            }
        }
    }
}