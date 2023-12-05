link-> https://www.geeksforgeeks.org/problems/merge-k-sorted-linked-lists/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions




//getting the array of node then tacle one node array of node at a time 
//merge them using merger method
//this just take care of the sorting plus merges the node;



ode mergeKList(Node[]arr,int k)
    {
        if(k==0){
            return null;
        }
        if(k==1){
            return arr[0];
        }
        Node head = merger(arr[0],arr[1]);
        for(int i=2;i<k;i++){
            Node curr = arr[i];
            head = merger(head,curr);
        }
        return head;
        //Add your code here.
    }
    Node merger(Node head,Node curr){
        Node a  = head;
        Node b = curr;
        Node tail = null;
        Node head1 = null;
        if(a.data<b.data){
            tail = a;
            a=a.next;
            head1 = tail;
        }else{
            tail = b;
            b=b.next;
            head1 = tail;
        }
        while(a!=null && b!=null){
            if(a.data<b.data){
                Node temp = a.next;
                tail.next =a;
                tail = tail.next;
                a = temp;
            }else{
                Node temp = b.next;
                tail.next =b;
                tail = tail.next;
                b = temp;
            }
        }
        if(a == null){
            tail.next = b;
        }else{
            tail.next = a;
        }
        return head1;
    }