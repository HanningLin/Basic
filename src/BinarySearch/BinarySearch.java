package BinarySearch;

import java.util.Arrays;


public class BinarySearch {

        /**
         *  递归写法
         */

        public static int binarySearch(int[] nums, int low, int high, int target) {
            if (high < low) {
                return -1;
            }
            int mid = (high - low) / 2 + high;
            if (nums[mid] > target) {
                return binarySearch(nums, low, mid - 1, target);
            } else if (nums[mid] < target) {
                return binarySearch(nums, mid + 1, high, target);
            } else {
                return mid;
            }
        }

        /**
         * 迭代1 left <= right
         * 最终结果 right < target < left
         * @param nums
         * @param target
         * @return
         */
        public static int binarySearch1(int[] nums, int target) {
            // 最终结果 right < target < left
            // right + 1 == left,
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    return mid;
                }
                System.out.println("mid = " + nums[mid] + "left = " + nums[left] + " right = " + nums[right]);
            }
            System.out.println("第一种：left = " + left + " right = " + right);
            return -1;
        }

        /**
         * 迭代2 left < right
         * 最终结果 target < left = right
         * @param nums
         * @param target
         * @return
         */
        public static int binarySearch2(int[] nums, int target) {
            int left = 0;
            int right = nums.length;    // 第一个区别
            while (left < right) {             // left = right 不执行 right 永远取不到
                int mid = (right - left) / 2 + left;
                if (nums[mid] > target) {
                    right = mid;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    return mid;
                }
                System.out.println("mid = " + nums[mid] + " left = " + nums[left] + " right index: " + right);
            }
            System.out.println("第二种：left = " + left + " right = " + right);
            return -1;
        }

        /**
         * 迭代2 left + 1 < right
         * 最终结果
         * @param nums
         * @param target
         * @return
         */
        public static int binarySearch3(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left + 1 < right) {
                int mid = (right - left) / 2 + left;
                if (nums[mid] > target) {
                    right = mid;
                } else if (nums[mid] < target) {
                    left = mid;
                } else {
                    return mid;
                }
            }
            System.out.println("第三种：left = " + left + " right = " + right);
            if (nums[right] == target) {
                return right;
            }  else if (nums[left] == target) {
                return left;
            }

            return -1;
        }


        public static void main(String[] args) {
            int[] nums = new int[]{1,3,5,9,10};
            System.out.println(Arrays.toString(nums));
            binarySearch3(nums, 6);

        }



    }


