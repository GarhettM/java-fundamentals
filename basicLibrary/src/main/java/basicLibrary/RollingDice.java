package basicLibrary;

import java.util.Random;

public class RollingDice {

    public int[] roll(int n) {
        int[] output = new int[n];
        Random rand = new Random();

        for(int i = 0; i < output.length; i++) {
            int randomNum = rand.nextInt((6-1) + 1) + 1;
            output[i] = randomNum;
        }
        return output;
    }

    public boolean containsDuplicates(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if(input[i] == input[j]) return true;
            }
        }
        return false;
    }

    public double calcAvg(int[] input) {
        double avg = 0.0;
        double div = input.length;
        for (double val : input ) {
            avg += val;
        }
        double output = avg / div;

        return output;
    }

    public int[] lowestAvgArr(int[][] input) {

        double low = 0;
        int[] lowArr = new int[input[0].length];
        for (int[] val : input) {
            double temp = calcAvg(val);
            boolean result = temp < low;
            if(low == 0) {
                low = temp;
                lowArr = val;
                continue;
            }
            if(result) {
                low = temp;
                lowArr = val;
            }
        }
        return lowArr;
    }
}
