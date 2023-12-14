link->https://www.geeksforgeeks.org/problems/print-linked-list-elements/1?page=2&category=Linked%20List&sortBy=submissions



void display(Node head)
    {
        Node help = head;
        while(help!=null){
            System.out.print(help.data+" ");
            help = help.next;
        }
    }