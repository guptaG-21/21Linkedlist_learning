link-> https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1?page=1&category=Linked%20List&difficulty=Hard&sortBy=submissions

//using recursion here to solve this problem
//first will go to left most and take head and tmp out of the function,so that the data will be stored


class Solution
{
    //Function to convert binary tree to doubly linked list and return it.
    Node head = null;
    Node tmp = null;
    Node bToDLL(Node root)
    {
        
	    if(root == null){
	        return null;
	    }
	    bToDLL(root.left);
	    
	    Node newNode = new Node(root.data);
	    if(head== null){
	        head = newNode;
	        tmp = newNode;
	        tmp.left = null;
	    }else{
	        tmp.right = newNode;
	        newNode.left = tmp;
	        tmp = newNode;
	    }
	    bToDLL(root.right);
	    return head;
    }
}