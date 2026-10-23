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
        //List<Integer> arr = new ArrayList<>();
        int N =0;
        ListNode temp= head;
        while(temp!=null){
            N++;
            temp = temp.next;
        }
        int[] arr = new int[N];
        ListNode curr = head;
        int i =0;
        while(curr!=null){
            arr[i] = curr.val;
            i++;
             curr = curr.next;
        }
        int left= 0;
        int right= arr.length-1;
        while(left<right){
            if(arr[left]!= arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}