import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int sequenceSize = input.nextInt();
    int[] sequence = getFibonacciSequence(sequenceSize);
    printIntArray(sequence);
  }
  
  private static void printIntArray(int[] sequence) {
    String formattedString = Arrays.toString(sequence)
        .replace(",", "")
        .replace("[", "")
        .replace("]", "");

    System.out.println(formattedString);
  }

  private static int[] getFibonacciSequence(int sequenceSize) {
    validateInput(sequenceSize);
    int[] sequence = new int[sequenceSize];
    sequence[0] = 0;

    if (sequenceSize > 1) sequence[1] = 1;

    for (int i = 2; i < sequenceSize; i++)
      sequence[i] = sequence[i - 2] + sequence[i - 1];

    return sequence;
  }

  private static void validateInput(int sequenceSize) throws RuntimeException {
    if (sequenceSize <= 0)
      throw new RuntimeException("Sequence too small.");
    else if (sequenceSize > 46)
      throw new RuntimeException("Sequence too large.");
  }
}