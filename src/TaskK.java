import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }

        int diffNum = 0;
        for (int i = 0; i < n; i++) {
            boolean seen = false;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    seen = true;
                    break;
                }
            }
            if (seen == false) {
                diffNum++;
            }
        }
        System.out.println(diffNum);
    }
}