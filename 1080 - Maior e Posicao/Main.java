import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        final int INT_NUMBER_QTT = 100;
        int[] numbers = new int[INT_NUMBER_QTT];

        int greatestNumberIdx = 0;

        for (int i = 0; i < numbers.length; i++) {
            do {
                numbers[i] = input.nextInt();
            } while (numbers[i] < 0);

            if (numbers[i] > numbers[greatestNumberIdx])
                greatestNumberIdx = i;
        }

        System.out.println(numbers[greatestNumberIdx]);
        System.out.println(greatestNumberIdx + 1);
    }
}
