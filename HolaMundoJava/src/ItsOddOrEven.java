
import java.util.Scanner;

public class ItsOddOrEven {

    public static void main(String args[]) {
        System.out.println("Insert the number");
        Scanner consola = new Scanner(System.in);
        int number = consola.nextInt();
        if(number % 2 == 0){
            System.out.println("Answer = " + "odd");
    }
        else{
            System.out.println("Answer = " + "even");
        }
}

}
