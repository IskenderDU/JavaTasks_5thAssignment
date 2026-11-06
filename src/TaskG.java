import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];

        int revResult = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int rev = nums.length - 1; rev >= 0; rev--) {
            System.out.print(nums[rev] + " ");
        }
    }
}