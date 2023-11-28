link-> https://www.geeksforgeeks.org/problems/remove-every-kth-node/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions


Node delete(Node head,int k ){
	Node tmp = head;
	int count = 0;
	Node prev = null;
//no change required if k is 0
	if(k == 0){
		return head;
	}
	while(tmp != null){
		count++;
//if we got the counting as same as k we break the address to remove the kth element
		if(count%k == 0){
//what if count is head
			if(prev == nulll){
				head = tmp.next;
			}else{
				prev.next = tmp.next;
			}
		}else{
			prev = tmp
		}	
		tmp = tmp.next;
	}
	return head;
}