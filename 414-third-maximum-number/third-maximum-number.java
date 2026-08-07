class Solution {
    public int thirdMax(int[] nums) {
        long f1 = Long.MIN_VALUE;
        long f2 = Long.MIN_VALUE;
        long f3 = Long.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == f1 || nums[i] == f2 || nums[i] == f3) {
                continue;
            }
            if (nums[i] > f1) {
                f3 = f2;
                f2 = f1;
                f1 = nums[i];
            } else if (nums[i] > f2) {
                f3 = f2;
                f2 = nums[i];
            } else if (nums[i] > f3) {
                f3 = nums[i];
            }
        }
        if(f3 == Long.MIN_VALUE){
            return (int)f1;
        }
          return (int)f3;
        }
    }
