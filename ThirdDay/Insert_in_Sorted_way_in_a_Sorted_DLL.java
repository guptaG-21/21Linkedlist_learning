link-> https://www.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions




public static Node sortedInsert(Node head,int value){
	Node newNode = new Node(value);
	if(head == null)return head;
	if(x<=head.data){
		newNode.next = head;
		head.prev = newnNode;
		return newNode;
	}
	Node currNode = head;
//getting just prev node of less than x if exists
	while(currNode.next!=null && currNode.next.data<x){
		currNode = currNode.next;
	}
	newNode.next = currNode.next;
//what if next node isn't null
	if(currNode.next!=null){
		currNode.next.prev = newNode;
	}
	currNode.next = newNode;
	newNode.prev = currNode;
	return head;
}