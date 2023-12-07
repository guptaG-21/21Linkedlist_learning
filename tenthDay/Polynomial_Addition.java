link->https://www.geeksforgeeks.org/problems/polynomial-addition/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions

//just make two dummy of p1 and p2
//arrange them according to the power and then just merge them using another LL



public static Node addPolynomial(Node p1,Node p2){
       Node NN = new Node(0,0);
       Node node = NN;
       Node first = p1;
       Node second = p2;
       while(first!=null && second!=null){
           if(first.pow == second.pow){
               Node newNode = new Node(first.coeff+second.coeff,first.pow);
               node.next = newNode;
               first = first.next;
               second = second.next;
               node = node.next;
           }else if(first.pow>second.pow){
                Node newNode = new Node(first.coeff,first.pow);
               node.next = newNode;
               first = first.next;
               node = node.next;
           }else{
               Node newNode = new Node(second.coeff,second.pow);
               node.next = newNode;
               second = second.next;
               node = node.next;
           }
       }
       while(first!=null){
           Node newNode = new Node(first.coeff,first.pow);
           node.next = newNode;
           first = first.next;
           node = node.next;
       }
       while(second!=null){
            Node newNode = new Node(second.coeff,second.pow);
            node.next = newNode;
            second = second.next;
            node = node.next;
       }
       return NN.next;
    }