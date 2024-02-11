
//given a value of n print only those number from 1 to N that have sum of digit =k;
import java.util.Scanner;

public class Program5 {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        for (int i = 1; i <= N; i++) {

            int sum = 0;

            for (int j = i; j > 0; j /= 10) {

                sum += j % 10;

                if (sum == K) {
                    System.out.println(i + " : " + sum);
                }

            }

        }

    }
}