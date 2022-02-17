import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        final int NUMBER_OF_QUESTIONS = 6;

        Scanner input = new Scanner(System.in);

        int numberOfPositives = 0;
        double[] answers = new double[NUMBER_OF_QUESTIONS];
        double mean = 0.0;
        boolean hasAPositive = false;

        do {
            for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
                answers[i] = input.nextDouble();

                if (answers[i] > 0) {
                    numberOfPositives++;
                    mean += answers[i];
                    hasAPositive = true;
                }
            }
        } while (!hasAPositive);

       mean /= numberOfPositives;

        System.out.println(numberOfPositives+" valores positivos");
        System.out.printf("%.1f\n",mean);
    }
}