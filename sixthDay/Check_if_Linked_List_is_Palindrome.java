link->https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions



 boolean isPalindrome(Node head) 
    {
        if(head == null || head.next == null)return true;
      Node mid = findmid(head);
      Node right = reverse(mid);
      Node left = head;
      while(right!=null){
          if(left.data!=right.data){
              return false;
          }
          left = left.next;
          right = right.next;
      }
      return true;
    }    
    //find the mid of LL
     Node findmid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; //this slow we will show the middle node of the linked list
    }
    //reverse the whole LL
    Node reverse(Node head){
        Node help = head;
        Node prev = null;
        while(help!=null){
            Node next = help.next;
            help.next = prev;
            prev = help;
            help = next;
        }
        head = prev;
        return head;
    }