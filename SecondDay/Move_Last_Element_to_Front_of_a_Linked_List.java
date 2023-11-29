link-> https://www.geeksforgeeks.org/problems/move-last-element-to-front-of-a-linked-list/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions






public static Node moveToFront(Node head) {
        // code here
        
        Node help = head;
        Node pre = null;
        if(head.next == null){
            return head;
        }
//just to reach the prev of null of LL and store the second last in pre
        while(help.next!=null){
            pre = help;
            help = help.next;
        }
        pre.next = null;
        help.next = head;
        head = help;
        return head;
}