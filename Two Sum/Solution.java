
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] combo = new int[2];
  
        for(int i = 0 ; i < nums.length; i++){
            for(int n = 0 ; n < nums.length; n++){
                if(i == n){
                    continue;
                }
                if(nums[i] + nums[n] == target){
                    combo[0] = i;
                    combo[1] = n;
                    return combo;
                }
            }
        }
        return combo;
    }
}