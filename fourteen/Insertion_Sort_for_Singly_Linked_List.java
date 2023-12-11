link->https://www.geeksforgeeks.org/problems/insertion-sort-for-singly-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//simple insetion sort

public static Node insertionSort(Node head)
    {
        Node sorted = new Node(0);
        Node curr = head;
        while(curr!=null){
            Node nxt = curr.next;
            Node dummy = sorted;
            while(dummy.next!=null && dummy.next.data <= curr.data){
                dummy = dummy.next;
            }
            curr.next = dummy.next;
            dummy.next = curr;
            curr = nxt;
        }
        return sorted.next;
    }