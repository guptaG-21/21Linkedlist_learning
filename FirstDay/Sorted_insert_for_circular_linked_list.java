link-> https://www.geeksforgeeks.org/problems/sorted-insert-for-circular-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions



public static Node sortedInsert(Node head,int data)
         {
           Node newNode = new Node(data);
           if(head == null){
               newNode.next = newNode;
               return newNode;
           }
           Node tmp = head;
           while(tmp.next!=head && newNode.data>tmp.data){
               tmp = tmp.next;
           }
//setting the node for the exact position
           newNode.next = tmp.next;
           tmp.next = newNode;

//what if the head data become more than newNode data then flip it
           if(tmp.data>newNode.data){
               int d = tmp.data;
               tmp.data = newNode.data;
               newNode.data = d;
           }
           return head;
         }
}