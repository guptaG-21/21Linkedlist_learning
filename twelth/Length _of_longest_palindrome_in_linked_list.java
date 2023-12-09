link->https://www.geeksforgeeks.org/problems/length-of-longest-palindrome-in-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//so what do we do there is , we have a commontCount functions which checks the common chars and store the count in res


public static int maxPalondrome(Node head){
	Node help = head;
	Node right = null;
	Node prev = null;
	int res = ;
	while(help!=null){
		right = help.next;
		help.next = prev;
		res = Math.max(res,2*commonCount(prev,right)+1);
		res = Math.max(res,2*commonCount(help,right));
		
		prev = help;
		help = right;

	}
	return res;
}

public static int commonCount(Node temp,Node prev){
	
	int count = 0;
	while(temp!=null && prev!=null){
		if(temp.data == prev.data){
			count++;
		}else{
			break;
		}
		temp = temp.next;
		prev = prev.next;
	}
	return count;
	
}