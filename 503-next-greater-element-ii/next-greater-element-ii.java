class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>s = new Stack<>();
        int great[] = new int[nums.length];
        int n = nums.length;
        for(int i= 2*n-1; i>=0; i--){

            int idx = i%n;
            while(!s.isEmpty() && nums[s.peek()] <= nums[idx]){
                s.pop();
            }

            if(i<n){
            if(s.isEmpty()){
              great[idx] = -1;
            }
            else{
                great[idx] = nums[s.peek()];
            }
            }
            s.push(idx);
        }
        return great;
    }
}