link-> https://www.geeksforgeeks.org/problems/prime-list--170646/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions


//check for prime numbers
//make prime numbers
//convert to node


Node primeList(Node head){
        //code here
        Node curr = head;
        while(curr != null){
            curr.val = primeNumber(curr.val);
            curr = curr.next;
        }
        return head;
    }
    boolean check(int num){
        if(num<=1)return false;
        if(num<=3)return true;
        if(num%2 == 0 || num%3 == 0)return false;
        for(int i=5;i*i<=num;i+=6){
            if(num%i == 0 || (num%(i+2)) == 0){
                return false;
            }
        }
        return true;
    }
    int primeNumber(int val){
        if(check(val))return val;
        int lower = val-1;
        int higher = val+1;
        while(true){
            if(check(lower))return lower;
            if(check(higher))return higher;
            lower--;
            higher++;
        }
    }