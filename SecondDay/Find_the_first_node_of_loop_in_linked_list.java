link-> https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions




public static int findFirstNode(Node head){
        //code here
        Node slow = head;
        Node fast = head;
        Node entry = head;
        
        while(fast.next!=null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
            //if its equal means there is a loop
            if(slow == fast){
		//to find the first data for loop
                while(slow!=entry){
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry.data;
            }
        }
        return -1;
    }