link-> https://www.geeksforgeeks.org/problems/sort-a-k-sorted-doubly-linked-list/1?page=3&category=Linked%20List&difficulty=Easy&sortBy=submissions


//sorting 
public Node sortAKSortedDLL(Node head, int k) {
        Node newNode = new Node(0);
        
        while(head!=null){
            Node next = head.next;
            Node dummy = newNode;
            
            while(dummy.next!=null && dummy.next.data<head.data){
                dummy = dummy.next;
            }
            head.next = dummy.next;
            dummy.next = head;
            head = next;
        }
        return newNode.next;
    }




