
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");

            } else if (i % 3 == 0) {
                System.out.println("Fizz");

            } else if (i % 5 == 0) {
                System.out.println("Bizz");
            } else {

                System.out.println(i);

                sum += i;

                if (sum >= 3 * n) {
                    break;
                }

            }

        }

    }

}
