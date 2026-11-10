import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        System.out.print(nums[n-1] + " ");
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
