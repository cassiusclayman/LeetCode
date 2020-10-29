public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int num1;
            int ind1;
            int num2;

            int lo = 0;
            int hi = nums.length - 1;
            int mid;
            int[] output = new int[2];

            while (lo <= hi) {
                mid = lo + (hi / 2);
                if (nums[mid] <= target) {
                    num1 = nums[mid];
                    ind1 = mid;
                    int lo2 = 0;
                    int hi2 = nums.length -1;
                    int mid2;

                    /*
                    find the second number's index
                     */
                    while(lo2 <= hi2) {
                        mid2 = lo2 + (hi2 / 2);
                        if (mid2 != ind1) {
                            if (nums[mid2] + num1 == target) {
                                output[0] = ind1;
                                output[1] = mid2;
                                return output;
                            }
                        }

                        if (nums[mid2] < target - num1) {
                            lo2 = mid2 + 1;
                        } else if (nums[mid2] > target - num1) {
                            hi2 = mid2 - 1;
                        }
                    }
                    /*
                    Second number was not found so keep trying to find a new first number
                     */
                    hi = mid - 1;
                }
                else if(nums[mid] > target){


                }

            }
        }
    }
}