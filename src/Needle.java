import java.util.*;

public class Needle {

    private Random generator;

    public Needle() {
        generator = new Random();
    }

    public double runExperiment(int totalDrops) {
        int totalIn = 0;

        for (int i = 0; i < totalDrops; i++) {

            double yLow = generator.nextDouble() * 2;
            double angle = generator.nextDouble() * 180;
            double yHigh = yLow + Math.sin(Math.toRadians(angle));

            if (yHigh >= 2) {
                totalIn++;
            }
        }

        double pi = (double) totalDrops / totalIn;
        return pi;
    }
}
