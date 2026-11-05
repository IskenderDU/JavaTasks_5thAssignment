import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];

        boolean sign = false;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] > 0 && nums[i-1] > 0) || (nums[i] < 0 && nums[i-1] < 0)) {
                sign = true;
                break;
            }
        }
        if (sign == true) {
            System.out.println("YES");
        }
        else if (sign == false) {
            System.out.println("NO");
        }
    }
}
