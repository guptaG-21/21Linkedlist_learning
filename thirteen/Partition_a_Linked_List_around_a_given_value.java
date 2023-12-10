//link->https://www.geeksforgeeks.org/problems/partition-a-linked-list-around-a-given-value/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//make three node and merge them on the basis of middle one


public static Node partition(Node node, int x) {
        Node node1 = new Node(0);
        Node help1 = node1;
        Node node2 = new Node(0);
        Node help2 = node2;
        Node node3 = new Node(0);
        Node help3 = node3;
        
        while(node!=null){
            if(node.data<x){
                help1.next = node;
                help1 = help1.next;
            }else if(node.data == x){
                help2.next = node;
                help2 = help2.next;
            }else{
                help3.next = node;
                help3 = help3.next;
            }
            node = node.next;
        }
        if(node2.next!=null){
            help1.next = node2.next;
            help2.next = node3.next;
        }else{
            help1.next = node3.next;
        }
        help3.next = null;
        return node1.next;
        
    }