link->https://www.geeksforgeeks.org/problems/sorted-list-to-bst/1?page=1&category=Linked%20List&difficulty=Hard&sortBy=submissions


 public TNode sortedListToBST(LNode head)
    {
        if(head == null){
            return  null;
        }
        LNode midF = mid(head);
        TNode root = new TNode(midF.data);
        if(midF == head){
            return root;
        }
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(midF.next);
        return root;
    }
//find mid
    LNode mid(LNode head){
        LNode slow = head;
        LNode fast = head;
        LNode prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(prev!=null){
            prev.next = null;
        }
        return slow;
    }