import java.util.Scanner;         //Пока неправильно

public class TaskJ_nepravilno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[in.nextInt()];

        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                max = nums[i];
            }
            else if (nums[i-1] > nums[i]) {
                max = nums[i-1];

            }
            //else if (nums[i-1] == nums[i]) {

            //}
        }
        System.out.println(max);
    }
}
