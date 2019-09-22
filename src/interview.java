
public class interview {
    public static int getSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += (sum % nums[i]);
            System.out.println(res);
            System.out.println(nums[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        System.out.println(getSum(nums));
    }
}