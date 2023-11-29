link-> https://www.geeksforgeeks.org/problems/split-a-circular-linked-list-into-two-halves/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions





void splitList(circular_LinkedList list)
        {
             //DO NOT REMOVE THESE 3 LINES
             Node head=list.head;
             Node head1=null;
             Node head2=null;
             
             //Modify these head1 and head2 here, head is the starting point of our original linked list. 
             Node slow = head;
             Node fast = head;
             head1 = slow;
//make sure that fast.next!= head cause fast is equal to head that is why we use this //condition
             while(fast.next!=head && fast.next.next!=head){
                 slow = slow.next;
                 fast = fast.next.next;
             }
             if(fast.next!=head){
                 fast = fast.next;
             }
//disconnecting and mking new CLL
             fast.next = slow.next;
             head2 = slow.next;
             slow.next = head;
             head1 = head;
             
             //DO NOT REMOVE THESE 2 LINES
             list.head1=head1;
             list.head2=head2;
	 }