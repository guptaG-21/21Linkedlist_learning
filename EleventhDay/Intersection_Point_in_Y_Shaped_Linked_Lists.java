link-> https://www.geeksforgeeks.org/problems/intersection-point-in-y-shaped-linked-lists--170645/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//here curr1 and currr2 run till they both are true
//when they are then they are at same distance
//you can solve this by just examinig their size too,and meking their size the same like //distance

int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node curr1 = head1;
         Node curr2 = head2;
         boolean travel1 =false;
         boolean travel2 =false;
         
         while(!travel1 || !travel2){
             curr1 = curr1.next;
             curr2 = curr2.next;
             if(curr1 == null){
                 curr1 = head2;
                 travel1 = true;
             }
             if(curr2 == null){
                 curr2 = head1;
                 travel2=true;
             }
         }
         while(curr1!=null){
             if(curr1 == curr2){
                 return curr1.data;
             }
             curr1 = curr1.next;
             curr2 = curr2.next;
         }
         return -1;
	}