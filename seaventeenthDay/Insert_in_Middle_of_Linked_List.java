link->https://www.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1?page=2&category=Linked%20List&sortBy=submissions



 public Node insertInMid(Node head, int data){
       Node slow = head;
       Node prev = null;
       Node fast = head;
       while(fast!=null && fast.next!=null){
           prev = slow;
           slow = slow.next;
           fast = fast.next.next;
       }
       Node node = new Node(data);
       int sizeO = size(head);
       if(sizeO%2==0){
           prev.next = node;
           node.next = slow;
       }else{
           Node right = slow.next;
           slow.next = node;
           node.next = right;
       }
       
       return head;
    }
    int size(Node head){
        Node help = head;
        int count = 0;
        while(help!=null){
            count++;
            help = help.next;
        }
        return count;
    }