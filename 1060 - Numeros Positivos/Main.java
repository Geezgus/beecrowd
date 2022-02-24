import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        final int NUMBER_OF_QUESTIONS = 6;

        double[] answers = new double[NUMBER_OF_QUESTIONS];
        int positivesCount = 0;

        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            do {
                answers[i] = input.nextDouble();
            } while (answers[i] == 0);

            if (answers[i] > 0)
                positivesCount ++;
        }

        System.out.println(positivesCount+" valores positivos");
    }
}
