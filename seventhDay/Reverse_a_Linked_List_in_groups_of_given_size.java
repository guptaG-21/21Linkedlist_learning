link->https://www.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions



//This is having two solution one is recursive and other is just simple one

//this is typical even to understand
public static Node reverse(Node head, int k)
    {
      Node pre = new Node(0);
      Node p = head;
      Node q = head.next;
      pre.next = head;
      head = pre;
      
      for(int i=1;q!=null;i++){
          if(i%k!=0){
              p.next = q.next;
              q.next = pre.next;
              pre.next = q;
              q = p.next;
          }else{
              pre = p;
              p = pre.next;
              q= p.next;
          }
      }
      return head.next;
    }


//easy to understand
public static Node reverse(Node head, int k)
    {
     Node next = null;
     Node help = head;
     Node prev = null;
     int count = 0;
     if(head==null){
         return head;
     }
     while(help!=null && count<k){
         next = help.next;
         help.next = prev;
         prev = help;
         help = next;
         count++;
     }
     head.next = reverse(next,k);
     return prev;
    }