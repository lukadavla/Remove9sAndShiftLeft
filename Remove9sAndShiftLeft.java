import java.util.Arrays;

public class Remove9sAndShiftLeft {
    public static void main(String[] args) {
        int[] array = {1, 9, 9, 2};
        int[] result = remove9sAndShiftLeft(array);
        System.out.println(Arrays.toString(result)); 
    }

    public static int[] remove9sAndShiftLeft(int[] nums) {
        int nonNineIndex = 0;

       
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 9) {
                nums[nonNineIndex] = nums[i];
                nonNineIndex++;
            }
        }

       
        for (int i = nonNineIndex; i < nums.length; i++) {
            nums[i] = 0;
        }

        return nums;
    }
}
