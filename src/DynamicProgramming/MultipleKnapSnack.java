package DynamicProgramming;


/**
 * 多重背包
 */
public class MultipleKnapSnack {

    public int multipleknapSnack(int[] value, int[] weight, int[] nums, int N, int C) {

        int[] memo = new int[C + 1];
        for (int i = 0; i < N; i++) {
            for (int j = C; j >= weight[i]; j--) {
                for (int k = 0; k <= nums[i]; k++) {
                    if (j - k * weight[i] >= 0) {
                        memo[j] = Math.max(memo[j], k * value[i] + memo[j - k * weight[i]]);
                    }
                }
            }
        }
        return memo[C];
    }
}
