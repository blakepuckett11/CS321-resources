public class CacheTest {
    public static void main(String[] args) {
        // Check for correct usage
        if (args.length < 4) {
            System.out.println("Incorrect Usage, the following is the correct usage: java CacheTest <cache-size> <number-of-Webpages> <standard-deviation> <debug-level=0-3> [<seed>]");
            return;
        }
        // Parse arguements into variables
        int cacheSize = Integer.parseInt(args[0]);
        int numPages = Integer.parseInt(args[1]);
        double standardDeviation = Double.parseDouble(args[2]);
        int debugLevel = Integer.parseInt(args[3]);
        // seed?
    }
}