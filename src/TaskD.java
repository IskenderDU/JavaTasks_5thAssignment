import java.util.Scanner;

public class TaskD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] numbers = new int[N];

        int pastquan = 0;
        int bigger = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
            int past = numbers[i];
            if (numbers[i] > numbers[i-1]) {
                pastquan++;
            }
        }
        System.out.println(pastquan);
    }
}