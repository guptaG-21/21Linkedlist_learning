link->https://www.geeksforgeeks.org/problems/circular-linked-list/1?page=1&category=Linked%20List&sortBy=submissions


boolean isCircular(Node head)
    {
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }