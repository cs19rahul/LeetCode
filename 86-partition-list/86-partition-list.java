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
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(0,null);
        ListNode h1 = l1;
        ListNode temp_1=h1;
        ListNode l2 = new ListNode(0,null);
    ListNode h2 = l2;
         ListNode temp_2=h2;
        ListNode curr = head; 
        
        while(curr!=null){
            if(curr.val<x){
                System.out.println("adding"+ curr.val + " l1");
                temp_1.next = new ListNode(curr.val,null);
                temp_1 = temp_1.next;
                
            }
            else {
                temp_2.next = new ListNode(curr.val,null);
             temp_2 = temp_2.next;}
            curr = curr.next;
        }
        
        ListNode temp1 = h1;
        // while(temp1!=null){
        //     System.out.print(temp1.val+" ");
        //     temp1 = temp1.next;
        // }
        
        ListNode ans ;
        if(h1.next== null){
            return h2.next;
        }
        else if(h2.next==null){
            return h1.next;
        }
        else{
          
                    
           temp_1.next = h2.next;
            
        }
        return h1.next;
    }
}