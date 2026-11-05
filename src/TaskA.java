import java.util.Scanner;

public class TaskA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            if (i % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}