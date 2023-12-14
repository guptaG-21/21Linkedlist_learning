link->https://www.geeksforgeeks.org/problems/identical-linked-lists/1?page=2&category=Linked%20List&sortBy=submissions


public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        int size1 = size(head1);
        int size2 = size(head2);
        if(size1!=size2){
            return false;
        }
        while(head1!=null && head2!=null){
            if(head1.data!=head2.data){
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;
    }
    int size(Node head){
        Node help = head;
        int count = 0;
        while(help!=null){
            count++;
            help = help.next;
        }
        return count;
    }