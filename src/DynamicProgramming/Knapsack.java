package DynamicProgramming;

public class Knapsack {


    /**
     * time: O(N * C) space same
     * @param weight
     * @param value
     * @param C
     * @param N
     * @return
     */
    public int kanpsnack01(int[] weight, int[] value, int C, int N) {
//        从0开始无法遍历到
        int[][] memo = new int[N][C + 1];

        for (int i = 0; i <= C; i++) {
            memo[0][i] = (i >= weight[0]) ? value[0] : 0;
        }
//        不放：f(i, c) = f(i - 1,c)
//        放了：v(i) + f(i - 1, c - w(i))
//        Max(f(i - 1, c), (v(i) + f(i - 1, c - w(i)); 不是把i-1放进去
        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= C; j++) {
                if (j < weight[i]) {
                    memo[i][j] = memo[i - 1][j];
                } else {
                    memo[i][j] = Math.max(memo[i - 1][j], value[i] + memo[i - 1][j - weight[i]]);
                }
            }
        }
        return memo[N - 1][C];
    }

    public int kanpsnack02(int[] weight, int[] value, int C, int N) {
//        从0开始无法遍历到
//        仅仅需要判断前一行即可 使用模二来判断奇偶

        int[][] memo = new int[2][C + 1];

        for (int i = 0; i <= C; i++) {
            memo[0][i] = (i >= weight[0]) ? value[0] : 0;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j <= C; j++) {
                if (j < weight[i]) {
                    memo[i % 2][j] = memo[(i - 1) % 2][j];
                } else {
                    memo[i % 2][j] = Math.max(memo[(i - 1) % 2][j], value[i] + memo[(i - 1) % 2][j - weight[i]]);
                }
            }
        }
        return memo[(N - 1) % 2][C];
    }

    public int kanpsnack03(int[] weight, int[] value, int C, int N) {
//        从0开始无法遍历到
//        仅仅需要判断前一行即可 使用模二来判断奇偶

        int[] memo = new int[C + 1];

        for (int i = 0; i <= C; i++) {
            memo[i] = (i >= weight[0]) ? value[0] : 0;
        }

        for (int i = 1; i < N; i++) {
            for (int j = C; j >= weight[i]; j--) {
                memo[j] = Math.max(memo[j], value[i] + memo[j - weight[i]]);
            }
        }
        return memo[C];
    }
}
