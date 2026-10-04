import java.util.ArrayList;
import java.util.List;

public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    public int numPplWhoGotTheirCoat(int[] permutation) {
        int peopleWithRightCoat = 0;

        for (int i = 0; i < numberOfPeople; i++) {
            if (permutation[i] == i + 1) {
                peopleWithRightCoat += 1;
            }
        }
        return peopleWithRightCoat;
    }

    public int[] simulateCoatExperiment(int iterations) {
        int[] result = new int[iterations];

        for (int i = 0; i < iterations; i++) {
            int [] permutation = RandomOrderGenerator.getRandomOrder(numberOfPeople);
            result[i] = numPplWhoGotTheirCoat(permutation);
            }
        return result;
    }

    public double answerToQuestionOne(int[] results) {
        int gotZero = 0;

        for (int i = 0; i < results.length; i++) {
            if (results[i] == 0) {
                gotZero += 1;
            }
        }
        return (double) gotZero / results.length;
    }

    public double answerToQuestionTwo(int[] results) {
        int sum = 0;

        for (int i = 0; i < results.length; i++) {
            sum += results[i];
        }
        return (double) sum / results.length;
    }
}

