/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer>vals = new ArrayList<Integer>();
        ListNode curr = head;
        while(curr !=null){
            vals.add(curr.val);
            curr = curr.next;
        }
        int front = 0;
        int back =vals.size()-1;
        while (front < back){
            if(!vals.get(front).equals(vals.get(back))){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}