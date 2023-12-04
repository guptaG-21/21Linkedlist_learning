link->https://www.geeksforgeeks.org/problems/flattening-a-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions



//this can be solve with or without the pq 
// if you use arraylist then sort that one

Node flatten(Node root)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Node node = new Node(0);
        Node help = node;
        
        while(root!=null){
          Node temp = root;
            while(temp!=null){
                pq.add(temp.data);
                temp = temp.bottom;
            }
            root = root.next;
        }
        int size = pq.size();
        for(int i=0;i<size;i++){
            int val = pq.poll();
            
            Node newNode = new Node(val);
            node.bottom = newNode;
            node = newNode;
        }
        return help.bottom;
    }