package Ass4;

import java.util.Random;

public class Athlete  {
    public static void main(String[] args) {
        String[] shootingRanges = new String[3];
        Random rand = new Random();
        for (int i = 0; i < shootingRanges.length; i++) {
            StringBuilder range = new StringBuilder();
            for (int j = 0; j < 5; j++) {
                if (rand.nextBoolean()) {
                    range.append("X");
                } else {
                    range.append("O");
                }
            }
            shootingRanges[i] = range.toString();
        }
        String shootingRangesString = String.join(",", shootingRanges);
        System.out.println(shootingRangesString);
    }
}
