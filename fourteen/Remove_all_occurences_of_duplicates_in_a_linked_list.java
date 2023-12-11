link->https://www.geeksforgeeks.org/problems/remove-all-occurences-of-duplicates-in-a-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//

public static Node removeAllDuplicates(Node head)
    {
        Node store = new Node(0);
        Node dummy = store;
        dummy.next = head;
        Node tmp = head.next;
        
        while(tmp!=null){
            boolean run = false;
            while(tmp!=null && dummy.next.data == tmp.data){
                run = true;
                tmp = tmp.next;
            }
            if(run)dummy.next = tmp;
            else dummy = dummy.next;
            
            if(tmp!=null)tmp = tmp.next;
        }
        return store.next;
    }