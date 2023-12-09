//link->https://www.geeksforgeeks.org/problems/merge-sort-on-doubly-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions



//using simply merge sort-on-doubly-linked-list/1


 public static Node sortDoubly(Node node)
	{
	    if (node == null || node.next == null) {
            return node;
        }
        Node second = splitList(node);
        node = sortDoubly(node);
        second = sortDoubly(second);
        return merge(node, second);
	}
	
	//Function to split the list into two halves.
	public static Node splitList(Node node)
    {
        Node fast = node, slow = node;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node temp = slow.next;
        slow.next = null;
        return temp;
    }
    
    //Function to merge two halves of list.
    public static Node merge(Node first, Node second)
    {
        //base cases when either of two halves is null.
        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }
 
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }