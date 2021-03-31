public class CalculAlea extends Thread {
    // tableau `a traiter
    private double[] t;
    // attribut qui indique sur quelle partie du tableau on travaille
    private int debut, fin;
    // constructeur
    public CalculAlea(double[] t, int debut, int fin){
        this.t = t; this.debut = debut; this.fin = fin;
    }
    // methode run
    public void run(){
        for (int i=debut; i<fin; i++){
            t[i] = Math.sqrt(Math.pow(Math.random(),2.0)+Math.pow(Math.random(),2.0));
        }
    }
}
