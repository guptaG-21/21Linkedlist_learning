link->https://www.geeksforgeeks.org/problems/linked-list-that-is-sorted-alternatingly/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions



//it can have o(n*log(n)) complexity solution and this one is pretty easy o(n^2)
//just keep checking and shifting

public Node sort(Node head){
        Node n1 = head;
        Node n2 = head.next;
        while(n2!=null){
            if(n1.data>n2.data){
                int t=n1.data;
                n1.data=n2.data;
                n2.data=t;
            } 
                n2=n2.next;
            if(n2==null){
                n1=n1.next;
                n2=n1.next;
            }
        }
        return head;
}