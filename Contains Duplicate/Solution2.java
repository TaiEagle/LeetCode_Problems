//this is an improvment on using the hashmap, this had a 1ms improved computing time and memory was reduced from 111 mb to 107
import java.util.HashSet;

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
       
        HashSet<Integer> visit = new HashSet<Integer>();
    
       
        for(int num : nums){
            //if it is in the hash set
            if(visit.contains(num) == true){
                return true;
            }
            else{
                visit.add(num);
            }
        }


        return false;
    }
}