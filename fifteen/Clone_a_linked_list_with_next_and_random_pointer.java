link->https://www.geeksforgeeks.org/problems/clone-a-linked-list-with-next-and-random-pointer/1?page=1&category=Linked%20List&difficulty=Hard&sortBy=submissions

//first we double every node then set the abs node then take out the clone


 Node copyList(Node head) {
        Node curr = head;
	//its for doubling every node for ex- 1->2-> ==> 1->1->2->2==>
        while(curr!=null){
            Node next = curr.next;
            curr.next = new Node(curr.data);
            curr.next.next = next;
            curr = next;
        }
        curr = head;
	//setting the random node
        while(curr!=null){
            if(curr.abs!=null){
                curr.next.abs = curr.abs.next;
            }
            curr = curr.next.next;
        }
        
        Node newHead = head.next;
        curr = head;
        Node copyNode = newHead;
        while(curr!=null){
            curr.next = curr.next.next;
            curr = curr.next;
            if(copyNode.next!=null){
                copyNode.next = copyNode.next.next;
                copyNode = copyNode.next;
            }
        }
        return newHead;
    }