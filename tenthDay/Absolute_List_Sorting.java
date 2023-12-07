link->https://www.geeksforgeeks.org/problems/absolute-list-sorting/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions


//we have two ways to solve this masterpiece one is to store and just sort
//second way is like connecting and deconnecting the nodes

Node sortList(Node head) {
		// Your code here
		
		Node curr = head;
		Node prev = null;
		if(curr == null) return head;
		while(curr != null){
		    
		    
		    if(curr.data < 0 && curr!=head){
		       prev.next = curr.next;
		        curr.next = head;
		        head = curr;
		        curr = prev.next;
		        
		    }else{
		        prev = curr;
		        curr = curr.next;
		    }
		    
		}
		
		return head;
}