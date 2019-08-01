package QuickSort;

public class Kth {
    public static int findKthLargest(int[] nums, int k) {
            if (nums == null || nums.length == 0)
                return 0;
            int left = 0;
            int right = nums.length - 1;
            while (true) {
                int pos = partition(nums, left, right);
                if (pos + 1 == k)
                    return nums[pos];
                else if (pos + 1 < k) {
                    left = pos + 1;
                } else if (pos + 1 > k) {
                    right = pos - 1;
                }
                return nums[left];
            }

        }

        private static int partition(int[] nums, int left, int right) {
            int pivot = nums[left];
            int l = left + 1;
            int r = right;
            while (l <= r) {
                if (nums[l] < pivot && nums[r] > pivot) {
                    swap(nums, l++, r--);
                }
                if (nums[l] >= pivot) l++;
                if (nums[r] <= pivot) r--;
            }
            swap(nums, left, r);
            return r;
        }

        private static void swap(int[] s, int i, int j) {
            int temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }

    public static void main(String[] args) {
        int[] test = {3,2,1,5,6,4};
        findKthLargest(test,2);

    }
}
