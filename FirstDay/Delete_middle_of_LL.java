link-> https://www.geeksforgeeks.org/problems/delete-middle-of-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions

solution -> 

Node deleteMiddle(Node head){
	Node slow = head;
	Node fast = head;
	Node prev = null;
	if(head == null || node.next == null){
		head = null;
		return null;
	}
	while(fast!=null && fast.next!=null){
//storing just previous value of middle
		prev = slow;
		slow = slow.next;
		fast = fast.next.next;
	}
//breaking the chain of middle element
	prev.next = slow.next;
	return head;
}