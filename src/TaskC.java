import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] numbers = new int[N];

        int pos = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            if (numbers[i] >= 0) {
                pos++;
            }
        }
        System.out.println(pos);
    }
}