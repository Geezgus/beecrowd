import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int evenNumbersQtt = 0;
        int oddNumbersQtt = 0;
        int positiveNumbersQtt = 0;
        int negativeNumbersQtt = 0;

        for (int i = 0; i < 5; i++) {
            int value = input.nextInt();

            if (value % 2 == 0)
                evenNumbersQtt++;
            else oddNumbersQtt++;

            if (value > 0)
                positiveNumbersQtt++;
            if (value < 0)
                negativeNumbersQtt++;
        }

        String fmt = "%d valor(es) par(es)\n" +
                     "%d valor(es) impar(es)\n" +
                     "%d valor(es) positivo(s)\n" +
                     "%d valor(es) negativo(s)\n";

        System.out.printf(fmt,
                          evenNumbersQtt,
                          oddNumbersQtt,
                          positiveNumbersQtt,
                          negativeNumbersQtt);
    }
}
