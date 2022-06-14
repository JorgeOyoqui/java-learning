
import java.util.Scanner;

public class Calculator {

    public static void main(String args[]) {
        System.out.println("Select your option (+ - / *)");
        Scanner consola = new Scanner(System.in);
        String flag = consola.nextLine();
        int NumberOne = 0;
        int NumberTwo = 0;

        System.out.println("Insert first number");
        NumberOne = Integer.parseInt(consola.nextLine());
        System.out.println("Insert second number");
        NumberTwo = Integer.parseInt(consola.nextLine());

        if (flag.equals("+")) {
            System.out.println("Answer = " + (NumberOne + NumberTwo));
        } else if (flag.equals("-")) {
            System.out.println("Answer = " + (NumberOne - NumberTwo));
        } else if (flag.equals("*")) {
            System.out.println("Answer = " + (NumberOne * NumberTwo));
        } else if (flag.equals("/")) {
            System.out.println("Answer = " + (NumberOne / NumberTwo));
        } else {
            System.out.println("Your option is not correct");
        }
    }
}
