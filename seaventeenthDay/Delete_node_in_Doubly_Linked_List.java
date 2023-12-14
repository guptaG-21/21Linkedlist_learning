link->https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1?page=2&category=Linked%20List&sortBy=submissions



Node deleteNode(Node head,int x)
    {
        int count = 1;
        Node help = head;
        Node previ = null;
        if(x == 1){
            head = head.next;
            head.prev = null;
        }
        while(count<x-1){
            help = help.next;
            count++;
        }
        help.next = help.next.next;
        return head;
    }