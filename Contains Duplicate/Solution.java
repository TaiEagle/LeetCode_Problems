import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> visited = new HashMap<>();

        for(int num : nums){
            //if it is in the hash map
            if(visited.get(num) != null){
                return true;
            }
            else{
                visited.put(num, 1);
            }
        }
        return false;
    }
}