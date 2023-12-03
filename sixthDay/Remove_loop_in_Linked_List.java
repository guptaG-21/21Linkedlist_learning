link-> https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions



public static void removeLoop(Node head){
        Node loopDetect = loop(head);
        if(loopDetect == null){
            return;
        }
        Node start = head;
//loopDetect react to the start using below.
        while(loopDetect != start){
            loopDetect = loopDetect.next;
            start = start.next;
        }
        Node ans = loopDetect;
        Node temp = ans;
        while(temp.next != ans){
            temp = temp.next;
        }
        temp.next = null;
    }
    //so this detects the loop
    static Node loop(Node head){
        Node first = head;
        Node second = head;
        while(second != null && second.next!=null){
            first = first.next;
            second = second.next.next;
            if(first == second){
                return first;
            }
        }
        return null;
    }