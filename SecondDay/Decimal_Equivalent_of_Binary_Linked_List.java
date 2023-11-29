link-> https://www.geeksforgeeks.org/problems/decimal-equivalent-of-binary-linked-list/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions


//just remeber to convert number to binary and binary to number

long DecimalValue(Node head)
   {
 	    long mod = (long)Math.pow(10,9)+7;
 	    Node currNode = head;
 	    long sum = 0;
 	    while(currNode!=null){
 	        sum = sum*2;
 	        sum = (sum+currNode.data)%mod;
 	        currNode = currNode.next;
 	    }
 	    return sum;
   }