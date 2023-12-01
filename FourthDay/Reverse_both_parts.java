link-> https://www.geeksforgeeks.org/problems/reverse-both-parts--170647/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions


//do two parts and join them after reverse
public static Node reverse(Node head,int k){
	Node prev = null;
	Node help = head;
	Node temp = null;
	while(help!=null){
//going until the k is 0, then we break it and provide to temp;
		Node next = help.next;
		help.next = prev;
		prev = help;
		help = next;
		k--;
		if(help!=null && k==0){
//prev keeps the next part 
			temp = prev;
			next = help.next;
			help.next = null;
			prev = help;
			help = next;
		}	
	}
	//merges the both LL
	head.next = prev;
	head = temp;
	return head;
}