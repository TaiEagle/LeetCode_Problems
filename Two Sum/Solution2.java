import java.util.HashMap;
//This is a more optomized two sum, run time is 3ms, O(N) run time
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] returnCombo = new int[2];
        int[] combo = new int[2];
        HashMap<Integer, Integer> visited = new HashMap<Integer, Integer>();
 
        for(int i = 0 ; i < nums.length; i++){
            //get the difference 
            int diff = target - nums[i];

            //if the difference is within the hash map
            if(visited.get(diff) != null){
                //return the indexes of the combo
                returnCombo[0] = i;
                returnCombo[1] = visited.get(diff);
                return returnCombo;
            }
            //add numbers already visited to the hash map
            visited.put(nums[i], i);
        }


        return combo;
    }
}