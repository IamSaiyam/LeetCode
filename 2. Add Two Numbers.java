//saiyamhk
//1568 / 1568 test cases passed.
//Status: Accepted

class Solution {
    
    int carry = 0;
    ListNode head = null;
    ListNode prevNode = head;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        while(l1!=null && l2!=null){
            int temp = l1.val + l2.val + carry;
            addNode(temp);
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            int temp = l1.val + carry;
            addNode(temp);
            l1 = l1.next;
        }
        
         while(l2 != null){
            int temp = l2.val + carry;
            addNode(temp);
            l2 = l2.next;
        }
        
        if(carry>0){
            addNode(carry);
        }
        
        return head;
    }
    
    public void addNode(int temp){
        if(temp>9){
                carry = temp/10;
                temp = temp%10;
            }else{
                carry = 0;
            }
            ListNode ln = new ListNode(temp, null);
            if(head == null){ 
                head = ln;
                prevNode = head;
            }
            if(prevNode != ln){
                prevNode.next = ln;
                prevNode = ln;
            }
    }
}
