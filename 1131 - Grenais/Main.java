import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // Goals = Inter x Gremio
        int[] goals = {0, 0};
        int[] victories = {0, 0};
        int ties = 0;
        int newGrenal;

        do {
            goals[0] = input.nextInt();
            goals[1] = input.nextInt();

            if (goals[0] > goals[1]) victories[0]++;
            else if (goals[0] < goals[1]) victories[1]++;
            else ties++;

            System.out.println("Novo grenal (1-sim 2-nao)");
            newGrenal = input.nextInt();

        } while (newGrenal == 1);

        String winner = victories[0] > victories[1] ? "Inter" : "Gremio";

        int total = victories[0] + victories[1] + ties;

        System.out.println(total+" grenais");
        System.out.println("Inter:"+victories[0]);
        System.out.println("Gremio:"+victories[1]);
        System.out.println("Empates:"+ties);
        System.out.println(winner+" venceu mais");
    }
}
