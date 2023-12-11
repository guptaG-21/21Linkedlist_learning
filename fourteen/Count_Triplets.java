link->https://www.geeksforgeeks.org/problems/count-triplets--141631/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions


//using set to store the head.data and checking.

static int countTriplets(Node head, int x) 
    { 
        //code here.
        Set<Integer> set = new HashSet<>();
        int count = 0;
        while(head!=null){
            Node tmp = head.next;
            while(tmp!=null){
                int l = x-head.data-tmp.data;
                if(set.contains(l))count++;
                tmp = tmp.next;
            }
            set.add(head.data);
            head = head.next;
        }
        return count;
    }