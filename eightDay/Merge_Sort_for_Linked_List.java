link-> https://www.geeksforgeeks.org/problems/sort-a-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions



//simple merge sort

static Node mergeSort(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        Node head1 = mergeSort(head);
        Node head2 = mergeSort(slow);
        Node ans = merger(head1,head2);
        return ans;
        // add your code here
    }
    static Node merger(Node head1,Node head2){
        Node temp = new Node(0);
        Node ans = temp;
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                Node node = head1.next;
                ans.next = head1;
                ans = ans.next;
                head1 = node;
            }else{
                Node node = head2.next;
                ans.next = head2;
                ans = ans.next;
                head2 = node;
            }
        }
        while(head1!=null){
            Node node = head1.next;
            ans.next = head1;
            ans = ans.next;
            head1 = node;
        }
        while(head2!=null){
            Node node = head2.next;
            ans.next = head2;
            ans = ans.next;
            head2 = node;
        }
        return temp.next;
    }