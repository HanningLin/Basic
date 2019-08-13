import java.util.ArrayList;
import java.util.List;

public class Test2 {
    /**
     * Given a sorted integer array without duplicates, return the summary of its ranges.
     *
     *      Example 1:
     *      Input: [0,1,2,4,5,7]
     *      Output: ["0->2","4->5","7"]
     *      Example 2:
     *      Input: [0,2,3,4,6,8,9]
     *      Output: ["0","2->4","6","8->9"]
     */

    public List<String> rangeSummary(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }

        for (int i = 0; i < nums.length; i++) {
            int start = 0;
            if (nums[i + 1] == nums[start] + 1) {
                continue;
            }
        }
        return new ArrayList<>();

    }
}
