link->https://www.geeksforgeeks.org/problems/rearrange-linked-list-in-place/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions




public static Node rearrange(Node root){
	Node start = root;
	Node end = root;
	Node tmp = null;
	while(end.next != null){
		temp = end;
		end = end.next;
	}
	while(start != end && start.next != end){
		end.next = start.next;
		start.next = end;
		tmp.next = null;
		start = end.next;
		//make sure the next is null 
		while(end.next!=null){
			tmp = end;
			end = end.next;
		}
	}
	return root;
}
