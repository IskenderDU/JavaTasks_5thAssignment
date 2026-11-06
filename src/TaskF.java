import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];

        int a = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 1; i < nums.length - 1; i++) {
            if ((nums[i-1] < nums[i]) && (nums[i+1] < nums[i])) {
                a++;
            }
        }
        System.out.println(a);
    }
}