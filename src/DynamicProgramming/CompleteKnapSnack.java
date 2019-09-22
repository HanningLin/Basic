package DynamicProgramming;

/**
 * 完全背包 无限放入
 */
public class CompleteKnapSnack {

    public int CompleteKnapSnack(int[] weight, int[] value, int C, int N) {
        int[][] memo  = new int[N + 1][C + 1];
//        for (int i = 1; i < C; i++) {
//            memo[0][i] = (i >= weight[i]) ? value[i] : 0;
//        }

        for (int i = 1; i <= N; i++) {
            for (int j = 0; j <= C; j++) {
//                weight starting from 0
                if (j < weight[i - 1]) {
                    memo[i][j] = memo[i - 1][j];
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], value[i - 1] + memo[i - 1][j - weight[i - 1]]);
                }
            }
        }
        return memo[N][C];
    }

    public int kanpsnack03(int[] weight, int[] value, int C, int N) {
//        从0开始无法遍历到
//        仅仅需要判断前一行即可 使用模二来判断奇偶

        int[] memo = new int[C + 1];

//        for (int i = 0; i <= C; i++) {
//            memo[i] = (i >= weight[0]) ? value[0] : 0;
//        }

        for (int i = 0; i < N; i++) {
            for (int j = C; j >= weight[i]; j--) {
                memo[j] = Math.max(memo[j], value[i] + memo[j - weight[i]]);
            }
        }
        return memo[C];
    }

    public int completeKnapSnack(int[] weight, int[] value, int C, int N) {
//        从0开始无法遍历到
//        仅仅需要判断前一行即可 使用模二来判断奇偶

        int[] memo = new int[C + 1];

        for (int i = 0; i < N; i++) {
            for (int j = weight[i]; j <= C; j++) {
                memo[j] = Math.max(memo[j], value[i] + memo[j - weight[i]]);
            }
        }
        return memo[C];
    }
}
