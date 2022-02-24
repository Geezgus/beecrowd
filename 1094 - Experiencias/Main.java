import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int rabbits = 0;
        int rats = 0;
        int frogs = 0;

        int testCasesQtt = input.nextInt();
        int quantity = 0;
        char type;

        for (int i = 0; i < testCasesQtt; i++) {
            int nextInt = input.nextInt();
            quantity += nextInt;
            type = input.next().charAt(0);

            if (type == 'C') rabbits += nextInt;
            else if (type == 'R') rats += nextInt;
            else if (type == 'S') frogs += nextInt;
        }

        System.out.println("Total: "+quantity+" cobaias");

        System.out.println("Total de coelhos: "+rabbits);
        System.out.println("Total de ratos: "+rats);
        System.out.println("Total de sapos: "+frogs);

        System.out.printf("Percentual de coelhos: %.2f %c\n",
          (double) (rabbits * 100) / quantity, '%');

        System.out.printf("Percentual de ratos: %.2f %c\n",
          (double) (rats * 100) / quantity, '%');

        System.out.printf("Percentual de sapos: %.2f %c\n",
          (double) (frogs * 100) / quantity, '%');
    }
}
