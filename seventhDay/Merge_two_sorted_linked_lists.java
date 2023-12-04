link-> https://www.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions




//just merge which one is small at first place then move to next 

Node sortedMerge(Node head1, Node head2) {
        
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        
        Node help = new Node(0);
        Node newNode = help;
        while(head1!=null && head2!=null){
            if(head1.data<head2.data){
                newNode.next = head1;
                head1 = head1.next;
            }else{
                newNode.next = head2;
                head2 = head2.next;
            }
            newNode = newNode.next;
        }
        while(head1!=null){
            newNode.next = head1;
            newNode= newNode.next;
            head1 = head1.next;
        }
        while(head2!=null){
            newNode.next = head2;
            newNode= newNode.next;
            head2 = head2.next;
        }
        return help.next;
   } 