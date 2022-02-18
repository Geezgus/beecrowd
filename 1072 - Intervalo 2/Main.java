import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int intNumbersQtt;
        do {
            intNumbersQtt = input.nextInt();
        } while (intNumbersQtt > 10000);

        int[] numbers = new int[intNumbersQtt];

        int in = 0;
        int out = 0;

        for (int i = 0; i < numbers.length; i++) {
            do {
                numbers[i] = input.nextInt();
            } while(numbers[i] <= -1 * Math.pow(10, 7) || numbers[i] >= Math.pow(10, 7));

            if (numbers[i] >= 10 && numbers[i] <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
