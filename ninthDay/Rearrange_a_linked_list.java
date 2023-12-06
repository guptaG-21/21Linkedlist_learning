link->https://www.geeksforgeeks.org/problems/rearrange-a-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions

void rearrangeEvenOdd(Node head)
    {
          //  The task is to complete this method
            //  The task is to complete this method
           //  The task is to complete this method
          if(head==null || head.next==null){
              return;
          }
          Node o=head;
          Node c=head.next.next;
          Node e=head.next;
          Node x=e;
          int i=3;
          while(c!=null){
              if(i%2!=0){
                  o.next=new Node(c.data);
                  o=o.next;
              }
              else{
                 x.next=new Node(c.data);
                 x=x.next;
              }
              c=c.next;
              i++;
          }
          x.next=null;
          o.next=e;
     }