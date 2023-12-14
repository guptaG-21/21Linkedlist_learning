link->https://www.geeksforgeeks.org/problems/node-at-a-given-index-in-linked-list/1?page=2&category=Linked%20List&sortBy=submissions


 public static int getNth(Node node, int ind)
    {
       //Your code here
       Node help = node;
       int num = 0;
       Node prev = null;
       while(help!=null){
           num++;
           prev = help;
           help = help.next;
           if(num == ind){
               break;
           }
       }
       return prev.data;
    }