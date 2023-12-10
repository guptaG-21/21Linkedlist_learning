

//link->https://www.geeksforgeeks.org/problems/quicksort-on-doubly-linked-list/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions

//simple work , just swapping
public static Node partition(Node l, Node h)
    {
        Node tmp = l;
        while(tmp!=h){
            if(tmp.data > h.data){
                int val = tmp.data;
                tmp.data = h.data;
                h.data = val;
            }
            tmp = tmp.next;
        }
        return tmp;
    }