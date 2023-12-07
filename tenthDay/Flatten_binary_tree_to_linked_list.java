link->https://www.geeksforgeeks.org/problems/flatten-binary-tree-to-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions


//its just a pre-tarversal ordered problem 

//we check for left nodes then gor left
//further check for right most then connect the node to the right of root
/*

ex-      1					
	/  \
       2    5      
     /  \    \
    3    4     6

	|
	|
	|
	



	 1					
	/  
       2         ------>    
     /  \    
    3    4     
	  \
	   5
            \
             6

 	|
 	|
	|
	|



	 1					
	/ \ 
      null 2         
    	   /  \    ------------> etc
    	  3    4     
	  	\
	   	 5
            	  \
                   6

		 



*/

public static void flatten(Node root){
	Node curr = root;
	while(curr!=null){
		if(curr.left!=null){
			Node prev = curr.left;
			while(prev.right!=null){
				prev = prev.right;;
			}
			prev.right = curr.right;
			curr.right = curr.left;
			curr.left = null;
		}
		curr = curr.next;
	}

}