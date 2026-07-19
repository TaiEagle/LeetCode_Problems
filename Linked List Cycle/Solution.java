import java.util.HashMap;
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        HashMap<ListNode, Integer> visited = new HashMap<>();
        //if there is atleast on node in the list
        if(head != null){

        //traverse the list
        while(head != null){
            
            //if the current node is in the hashmap/ already visited
            if(visited.get(head) != null){
                return true;
            }
            //add the node to the visited
            visited.put(head, 1);
            head = head.next;
            
        }
        //currNode becomes null
        return false;
        }
        // the list is empty
        else{return false;}
    }
    
}