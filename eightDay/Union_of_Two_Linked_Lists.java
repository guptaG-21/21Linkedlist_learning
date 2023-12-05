link-> https://www.geeksforgeeks.org/problems/union-of-two-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions




//making sure to have unique element LL 
//use Set with implementing of HashSet, you may use TreeSet as well then no need to copy
public static Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    Set<Integer> s = new HashSet<>();
	    if(head1==null){
	        return head2;
	    }else if(head2 == null){
	        return head1;
	    }
	    while(head1!=null && head2!=null){
	        s.add(head1.data);
	        s.add(head2.data);
	        head1 = head1.next;
	        head2 = head2.next;
	    }
	    while(head1!=null){
	         s.add(head1.data);
	         head1 = head1.next;
	    }
	    while(head2!=null){
	         s.add(head2.data);
	         head2 = head2.next;
	    }
	    List<Integer>list = new ArrayList<>();
	    for(int item:s){
	        list.add(item);
	    }
	    Collections.sort(list);
	    Node node = new Node(0);
	    Node help = node;
	    for(int i =0;i<list.size();i++){
	        int val = list.get(i);
	        Node newNode = new Node(val);
	        node.next = newNode;
	        node = node.next;
	    }
	    return help.next;
	}