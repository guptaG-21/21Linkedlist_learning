link->https://www.geeksforgeeks.org/problems/mail-system-design2856/1?page=2&category=Linked%20List&difficulty=Medium&sortBy=submissions

//make your own addlast and remove and then just take two variables head and size;

class LinkedList{
    Node head;
    int size;
    void addLast(int val){
        Node temp = new Node(val);
        temp.right = null;
        if (size==0)
        {
            head = temp;
            size++;
            return;
        }
        Node last = head;
        while (last.right != null)
            last = last.right;
        last.right = temp;
        size++;
        return;
    }
    void remove(int key){
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.right;
            size--;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.right;
        }
        if (temp == null)
            return;
        prev.right = temp.right;
        size--;
    }
}
class Solution{
    
    static List<Node> mailDesign(int N, int Q, int query[]){
        LinkedList unread = new LinkedList();
        for(int i=1;i<=N;i++){
            unread.addLast(i);
        }
        LinkedList read = new LinkedList();
        LinkedList trash = new LinkedList();
        for(int i=0;i<query.length;i=i+2){
            if(query[i]==1){
                read.addLast(query[i+1]);
                unread.remove(query[i+1]);
            }
            else if(query[i]==2){
                trash.addLast(query[i+1]);
                read.remove(query[i+1]);
            }
            else if(query[i]==3){
                trash.addLast(query[i+1]);
                unread.remove(query[i+1]);  
            }
            else if(query[i]==4){
                read.addLast(query[i+1]);
                trash.remove(query[i+1]);
            }
        }
        ArrayList<Node> list = new ArrayList<>();
        list.add(unread.head);
        list.add(read.head);
        list.add(trash.head);
        return list;
    }
}