import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int amountOfPairs = 0;

        for (int i = 0; i < 5; i++) {
            int value = input.nextInt();

            if (value % 2 == 0)
                amountOfPairs++;            
        }

        System.out.println(amountOfPairs+" valores pares");
    }
}