link-> https://www.geeksforgeeks.org/problems/move-all-zeros-to-the-front-of-the-linked-list/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions



//this can have more than two approaches 
//first-> using Queue , store non zero and then merge
//second-> using Node , make two node ll and merge them
//i have used second one where i will be making 2 LL one for zeros and other for nonZeros
public Node moveZeroes(Node head){
        Node nonZeroStart = new Node(0);
        Node zeroStart = new Node(0);
        Node zero = zeroStart;
        Node nonZero = nonZeroStart;
        Node help = head;
        while(help!=null){
            if(help.data == 0){
                zero.next = help;
                zero = help;
            }else{
                nonZero.next = help;
                nonZero =help;
            }
            help = help.next;
        }
        zero.next = nonZeroStart.next;
        nonZero.next = null;
        return zeroStart.next;
    }