link->https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions



static Node addTwoLists(Node first, Node second){
        // code here
        // return head of sum list
        first = reverse(first);
        second = reverse(second);
        int c = 0;
        Node head = null;
        Node curr = null;
        while(first!=null || second!=null || c!=0){
            int sum = (first!=null?first.data:0)+(second!=null?second.data:0)+c;
            int digit = sum%10;
            c = sum/10;
            Node newNode = new Node(digit);
            if(head == null){
                head = newNode;
                curr = head;
            }else{
                curr.next = newNode;
                curr = curr.next;
            }
            if(first!=null){
                first = first.next;
            }
            if(second!=null){
                second = second.next;
            }
        }
        head = reverse(head);
        return head;
    }
    static Node reverse(Node head){
        Node prev =null;
        while(head!=null){
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }