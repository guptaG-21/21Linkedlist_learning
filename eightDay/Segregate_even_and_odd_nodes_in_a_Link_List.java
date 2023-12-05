link-> https://www.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1?page=1&category=Linked%20List&difficulty=Medium&sortBy=submissions






//just store even and odd somewhere like in a list then just make change in head LL data

Node divide(int N, Node head){
        // code here\
        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        Node help = head;
        while(help!=null){
            int val = help.data;
            if(val%2 == 0){
                evenList.add(val);
            }else{
                oddList.add(val);
            }
            help = help.next;
        }
        help = head;
        for(int i = 0;i<evenList.size();i++){
            int val = evenList.get(i);
            help.data = val;
            help = help.next;
        }
        for(int i = 0;i<oddList.size();i++){
            int val = oddList.get(i);
            help.data = val;
            help = help.next;
        }
        return head;
    }