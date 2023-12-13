link->https://www.geeksforgeeks.org/problems/reverse-a-sublist-of-a-linked-list/1?page=1&category=Linked%20List&difficulty=Hard&sortBy=submissions


public static Node reverseBetween(Node head, int m, int n)
    {
        if(head==null || head.next ==null || m==n)return head;
        Node dummy=new Node(-1);
        dummy.next=head;
        Node prev= dummy;
        for(int i=1;i<m;i++){
            prev =prev.next;
        }
        Node curr = prev.next;
        
        for(int i=m;i<n;i++){
            Node next = curr.next;
            curr.next = next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;
    }