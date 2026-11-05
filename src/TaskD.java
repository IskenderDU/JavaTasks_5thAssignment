import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] numbers = new int[N];

        int bigger = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i-1]) {
                bigger++;
            }
        }
        System.out.println(bigger);
    }
}