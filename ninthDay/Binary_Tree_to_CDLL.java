link->https://www.geeksforgeeks.org/problems/binary-tree-to-cdll/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions


//inorder traversal

    Node head = null;
    Node prev = null;
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        //your code here
        if(root == null){
            return null;
        }
        inorder(root);
        prev.right = head;
        head.left = prev;
        return head;
    }
    void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            if(head == null){
                head = root;
            }
            if(prev!=null){
                prev.right = root;
            }
            root.left = prev;
            prev = root;
            inorder(root.right);
        }
    }
    