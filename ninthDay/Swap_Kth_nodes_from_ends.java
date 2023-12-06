link->https://www.geeksforgeeks.org/problems/swap-kth-node-from-beginning-and-kth-node-from-end-in-a-singly-linked-list/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions


//reaching to the kth node from front and also from last.
Node swapkthnode(Node head, int num, int k)
    {
        // your code here
        if(k>num){
            return head;
        }
        Node l = head;
        Node prevL = null;
        Node r = head;
        Node prevR = null;
        int count = 1;
        while(count<k){
            prevL = l;
            l = l.next;
            count++;
        }
        count = 1;
        while(count<num-k+1){
            prevR = r;
            r = r.next;
            count++;
        }
        if(prevL!=null)prevL.next = r;
        if(prevR!=null)prevR.next = l;
        
        Node temp = l.next;
        l.next = r.next;
        r.next = temp;
        
        if(k == 1){
            head = r;
        }else if(k == num){
            head = l;
        }
        return head;
    }