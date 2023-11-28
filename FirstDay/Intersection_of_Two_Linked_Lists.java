link->https://www.geeksforgeeks.org/problems/intersection-of-two-linked-list/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions



public static Node findIntersection(Node head1, Node head2)
    {
//storing the values at key oof head1 LL
        Map<Integer,Integer> map = new HashMap<>();
        Node dummy = new Node(0);
        Node newLL = dummy;
        while(head2!=null){
            map.put(head2.data,map.getOrDefault(head2.data,0)+1);
            head2 = head2.next;
        }
//checking and making newLL
        while(head1!=null){
            if(map.containsKey(head1.data)){
                newLL.next = new Node(head1.data);
                newLL = newLL.next;
            }
            head1 = head1.next;
        }
        return dummy.next;
    }