link->https://www.geeksforgeeks.org/problems/given-a-linked-list-reverse-alternate-nodes-and-append-at-the-end/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions



//just make two list of non- alternative and alternative and merge accordingly
public static void rearrange(Node odd)
    {
        // add your code here
        List<Integer>nonAlternative = new ArrayList<>();
        Stack<Integer>alternative = new Stack<>();
        
        Node help = odd;
        
        int count =1;
        while(help!=null){
            int val = help.data;
            if(count%2 == 0){
                alternative.add(val);
                count++;
            }else{
                nonAlternative.add(val);
                count++;
            }
            help = help.next;
        }
        help = odd;
        int sizeOfAlternative = alternative.size();
        int sizeofNonAlternative = nonAlternative.size();
        for(int i=0;i<sizeofNonAlternative;i++){
            int val = nonAlternative.get(i);
            help.data = val;
            help = help.next;
        }
        for(int i=0;i<sizeOfAlternative;i++){
            int val = alternative.pop();
            help.data = val;
            help = help.next;
        }
    }