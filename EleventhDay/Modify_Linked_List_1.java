link->https://www.geeksforgeeks.org/problems/modify-linked-list-1-0546/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//make stack of node after the middle one and midify the starting and the stack nodes


public static Node modifyTheList(Node head)
    {
        Node slow = head;
        Node fast = head.next;
        
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = slow.next;
        Stack<Node> st = new Stack<>();
        while(slow!=null){
            st.add(slow);
            slow = slow.next;
        }
        
        Node curr = head;
        while(!st.isEmpty()){
            Node top = st.peek();
            st.pop();
            int temp = curr.data;
            curr.data = top.data-temp;
            top.data = temp;
            curr = curr.next;
        }
        return head;
    }