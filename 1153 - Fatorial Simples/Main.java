import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    Scanner input = new Scanner(System.in);
    int operand = input.nextInt();
    System.out.println(getFactorial(operand));
  }

  private static int getFactorial(int operand) {
    validateInput(operand);

    for (int i = operand - 1; i > 0; i--)
      operand *= i;

    return operand;
  }

  private static void validateInput(int operand) throws RuntimeException {
    if (operand <= 0)
      throw new RuntimeException("operand too small.");
    else if (operand > 13)
      throw new RuntimeException("operand too large.");
  }
}
