

//link->https://www.geeksforgeeks.org/problems/quick-sort-on-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions

//we are using quick sort here 


//the original quick sort work ahppen here
public static Node quickSort(Node node)
    {
        if(node == null || node.next == null){
            return node;
        }
        Node[] part = partition(node);
        Node leftHead = part[0];
        Node pivot = part[1];
        Node rightHead = part[2];
        
        Node lHead = quickSort(leftHead);
        Node rHead = quickSort(rightHead);
        pivot.next = rHead;
        if(lHead == null){
            return pivot;
        }
        Node tail = getTail(lHead);
        tail.next = pivot;
        return lHead;
    }
	//this helps you to get the end node of LinkedList
    public static Node getTail(Node head){
        Node help = head;
        while(help.next!=null){
            help = help.next;
        }
        return help;
    }
	//this do the three partition of LinkedList
    public static Node[] partition(Node head){
        Node help = head.next;
        Node pivot = head;
        pivot.next = null;
        
        Node leftHead = null,leftTail = null;
        Node rightHead = null,rightTail = null;
        while(help!=null){
            Node tmp = help.next;
            help.next = null;
            if(pivot.data>=help.data){
                if(leftHead == null){
                    leftHead = leftTail = help;
                }else{
                    leftTail.next = help;
                    leftTail = leftTail.next;
                }
            }else{
                if(rightHead == null){
                    rightHead = rightTail = help;
                }else{
                    rightTail.next = help;
                    rightTail = rightTail.next;
                }
            }
            help = tmp;
        }
        Node[] part = {leftHead,pivot,rightHead};
        return part;
    }