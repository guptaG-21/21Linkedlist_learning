link-> https://www.geeksforgeeks.org/problems/merge-2-sorted-linked-list-in-reverse-order/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions




 Node mergeResult(Node node1, Node node2)
    {
        Node dummy = new Node(0);
        Node curr = dummy;
        while(node1!=null && node2!=null){
            if(node1.data<node2.data){
                curr.next = node1;
                node1 = node1.next;
            }else{
                curr.next = node2;
                node2 = node2.next;
            }
            curr = curr.next;
        }
         if(node1!=null){
             curr.next = node1;
        }
        if(node2!=null){
            curr.next = node2;
        }
        return reverse(dummy.next);
    }
//just to reverse the linked-list for example-> (1->2->3->4->null) will be (4->3->2->1->   // null)
    Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        while(curr!=null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }