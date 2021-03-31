public class TestImpression {
    public static void main(String[] args) {
        Thread doc1 = new Thread(new Impression("doc1", 5));
        Thread doc2 = new Thread(new Impression("doc2", 5));
        doc1.start();
        doc2.start();
    }
}
