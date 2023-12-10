link->https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//carry and adding sum to LL

class GfG {

    Node cur; 
    int carry;
    int sum;
    
    void addCarryToRemaining(Node head, LinkedList res)  { 
        if(head!=cur){
            addCarryToRemaining(head.next,res);
            sum = (head.data+carry)%10;
            carry = (head.data+carry)/10;
            res.push(sum);
        }
    } 
   
	void addSameSize(Node head1, Node head2, LinkedList res) { 
	    Node rev1 = reverse(head1);
	    Node rev2 = reverse(head2);
	    
	    while(rev1!=null && rev2!=null ){
	        sum = (rev1.data+rev2.data+carry)%10;
	        carry = (rev1.data+rev2.data+carry)/10;
	        res.push(sum);
	        rev1 = rev1.next;
	        rev2 = rev2.next;
	    }
	    
    }
    Node reverse(Node head){
        Node right = null;
        Node help = head;
        Node prev = null;
        while(help!=null){
            right = help.next;
            help.next = prev;
            prev = help;
            help = right;
        }
        return prev;
    }
} 