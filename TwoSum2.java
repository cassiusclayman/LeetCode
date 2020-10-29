import java.util.Arrays;

public class TwoSum2 {
    static class Solution {
        public static int[] twoSum(int[] nums, int target) {

            int ind1;
            int ind2;
            int[] output = new int[2];
            Arrays.sort(nums);
            for(int i = 0; nums[i] < target; i ++) {
                ind1 = i;
                int lo = i;
                int hi = nums.length - 1;
                int mid;
                while (lo <= hi) {
                    mid = lo +((hi - lo) / 2);
                    System.out.println("MID: " + mid + " MID VALUE: " + nums[mid] + " LO: " + lo + " HI: " + hi + "/ IND 1: " + ind1);

                    if (nums[mid] + nums[ind1] == target) {
                        if(mid != ind1) {
                            output[0] = ind1;
                            output[1] = mid;
                            return output;
                        }
                        else{
                            lo = mid + 1;
                        }
                    } else if (nums[mid] > (target - nums[ind1])) {
                        hi = mid - 1;
                    } else if (nums[mid] < (target - nums[ind1])) {
                        lo = mid + 1;
                    }
                }

            }
            return output;
        }
        public static void main(String[] args){
            int[] test = new int[]{0, 4, 3, 0};
            int[] out = twoSum(test, 3);
            System.out.println("Index 1: " + out[0] + ", Num 1: " + test[out[0]] + "; Index 2: " + out[1] + ", Num 2: " + test[out[1]]);
        }
    }
}

