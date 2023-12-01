link-> https://www.geeksforgeeks.org/problems/split-singly-linked-list-alternatingly/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions





//making two LL
public void alternatingSplitList(Node head){
       //Your code here
       Node odd = head;
       Node even = head.next;
       GFG.a = odd;
       GFG.b = even;
       while(even!=null && even.next!=null){
           odd.next = even.next;
           odd = odd.next;
           even.next = odd.next;
           even = even.next;
       }
       odd.next = null;
    }