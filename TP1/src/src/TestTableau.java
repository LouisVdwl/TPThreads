public class TestTableau {
    public static void main(String[] args) throws InterruptedException {
        int arraySize;
        arraySize = 100000;

        double[] tab;
        tab = new double[arraySize];

        Tableau.alea2Thread(tab);
        Tableau.alea(tab, 5);
    }
}
