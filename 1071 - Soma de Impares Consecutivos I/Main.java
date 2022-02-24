import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int oddSum = 0;

        if (x < y) {
            for (int i = x + 1; i < y; i++)
                if (i % 2 != 0) oddSum += i;
        }

        if (x > y) {
            for (int i = x - 1; i > y; i--)
                if (i % 2 != 0) oddSum += i;
        }

        System.out.println(oddSum);
    }
}
