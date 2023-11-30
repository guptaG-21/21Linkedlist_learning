link-> https://www.geeksforgeeks.org/problems/deletion-and-reverse-in-linked-list/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions






 public static Node deleteNode(Node head,int d)
    {
        Node tmp = head;
        Node prev = null;
        if(head==null){
            return head;
        }
        while(tmp.next!=head){
            if(tmp != null){
                if(tmp.next.data == d){
                    tmp.next = tmp.next.next;
                    return head;
                }
            }
            tmp = tmp.next;
        }
        Node tail = tmp;
        if(d == head.data){
            tail.next = head.next;
            return head.next;
        }
        return null;
        
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
       
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr.next!=head){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        curr.next=prev;
        prev=curr;
        head.next=prev;
        return prev;
    }