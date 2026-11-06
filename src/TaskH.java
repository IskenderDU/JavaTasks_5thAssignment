import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];


        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        if (n % 2 == 0) {  // Если четный
            for (int j = 0; j < nums.length; j += 2) {
                int first = nums[j + 1];
                int second = nums[j + 1 - 1];
                System.out.print(first + " " + second + " ");
            }
        } else {    // Если нечетный
            for (int j = 0; j < nums.length; j+=2) {
                if (j >= n - 1) {
                    System.out.print(nums[j]);
                    break;
                }
                int first = nums[j + 1];
                int second = nums[j + 1 - 1];
                System.out.print(first + " " + second + " ");
            }
        }
    }
}