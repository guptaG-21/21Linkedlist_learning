link->https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions

//find the size for both and check if greater, min or equal.


	int intersectPoint(Node head1, Node head2)
	{
         // code here
         Node cal1 = head1;
         Node cal2 = head2;
         int size1 = 0;
         int size2 = 0;
         while(cal1!=null){
             size1++;
             cal1 = cal1.next;
         }
         while(cal2!=null){
             size2++;
             cal2 = cal2.next;
         }
         
         while(head1!=null && head2!=null){
             if(head1 == head2){
                 int val = head1.data;
                 return val;
             }
             if(size1>size2){
                 head1 = head1.next;
                 size1--;
             }else if(size1<size2){
                 head2 = head2.next;
                 size2--;
             }else{
                 head1 = head1.next;
                 head2 = head2.next;
                 size1--;
                 size2--;
             }
	    }
	return -1;
    }