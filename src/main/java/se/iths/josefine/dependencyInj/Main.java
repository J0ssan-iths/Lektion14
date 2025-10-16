package se.iths.josefine.dependencyInj;

public class Main {
    public static void main(String[] args) throws Exception {
        HttpFetcher realHttpFetcher = new RealHttpFetcher();

        try {
            System.out.println(realHttpFetcher.fetchPostById(1));
        } catch (Exception e) {
            System.err.println("Ett fel uppstod...");
        }
    }
}
