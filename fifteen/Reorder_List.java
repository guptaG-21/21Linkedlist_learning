link->https://www.geeksforgeeks.org/problems/reorder-list/1?page=1&category=Linked%20List&difficulty=Hard&sortBy=submissions


void reorderlist(Node head) {
       
       Node slow = head;
       Node fast = head;
       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       Node a = reverse(slow.next);
       slow.next = a;
       Node p1 = head;
       Node t = head;
//this one is the main logic to actually reorder
       while(slow.next!=null){
           Node p2 = slow.next;
           slow.next = p2.next;
           t = p1.next;
           p2.next = t;
           p1.next = p2;
           p1 = t;
           t = t.next;
       }
    }
    Node reverse(Node head){
        Node help = head;
        Node prev = null;
        Node right = null;
        while(help!=null){
            right = help.next;
            help.next = prev;
            prev = help;
            help = right;
        }
        return prev;
    }