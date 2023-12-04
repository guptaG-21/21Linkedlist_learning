link-> https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions


//first reverse it ,
//take a carry with number 1
//add to number and move it and take carry 

public static Node addOne(Node head) 
    { 
        if(head == null){
            return null;
        }
        head = reverse(head);
        Node help = head;
        int sum = 0;
        int carry = 1;
        while(help!=null){
            sum = help.data+carry;
            help.data = sum%10;
            carry = sum/10;
            if(help.next == null && carry>0){
                help.next = new Node(carry);
                break;
            }
            help = help.next;
        }
        head = reverse(head);
        return head;
    }
    static Node reverse(Node head){
        Node help = head;
        Node prev = null;
        while(help!=null){
            Node next = help.next;
            help.next = prev;
            prev = help;
            help = next;
        }
        return prev;
    }