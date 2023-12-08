link->https://www.geeksforgeeks.org/problems/leaves-to-dll/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//store in a List and then make a LL and return plus modify the tree


public Node convertToDLL(Node root)
    {
        ArrayList<Integer>list = new ArrayList<>();
        helper(root,list);
        Node head = null,tail = null;
        for(int num:list){
            Node newNode = new Node(num);
            if(head == null){
                head = tail = newNode;
            }else{
                tail.right = newNode;
                newNode.left = tail;
                tail = tail.right;
            }
        }
        modifyTree(root);
        return head;
    }
    
    public void helper(Node head,ArrayList<Integer>list){
        if(head == null){
            return;
        }
        helper(head.left,list);
        if(head.left!=null && head.left.left == null && head.left.right == null){
            list.add(head.left.data);
        }
        if(head.right!=null && head.right.right == null && head.right.left == null){
             list.add(head.right.data);
        }
         helper(head.right,list);
    }
    
    public void modifyTree(Node head){
        if(head == null){
            return;
        }
        if(head.left!=null && head.left.left == null && head.left.right == null){
            head.left = null;
        }
        if(head.right!=null && head.right.right == null && head.right.left == null){
            head.right = null;
        }
        modifyTree(head.left);
        modifyTree(head.right);
    }