link-> https://www.geeksforgeeks.org/problems/linked-list-in-zig-zag-fashion/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions


public static Node zigZag(Node head){
	    Node tmp = head;
	    boolean flag = true;
	    while(tmp!=null && tmp.next!=null){
	        if(flag){
//if flag true and element is greater than the next
	            if(tmp.data>tmp.next.data){
	                int num = tmp.data;
	                tmp.data = tmp.next.data;
	                tmp.next.data = num;
	            }
	        }else{
//flag is false and the element is less than the next
	            if(tmp.data<tmp.next.data){
	                int num = tmp.data;
	                tmp.data = tmp.next.data;
	                tmp.next.data = num;
	            }
	        }
	        tmp = tmp.next;
	        flag = !flag;
	    }
	    return head;
    }