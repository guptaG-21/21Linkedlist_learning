link-> https://www.geeksforgeeks.org/problems/linked-list-matrix/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions


//construction of 2d with right and down, recursively
static Node construct(int arr[][],int n)
    {
        //Add your code here.
        Node head = null;
        return build(arr,0,0,n,head);
    }
    static Node build(int[][] arr,int r,int c,int n, Node head){
        if(r>=n || c>=n){
            return null;
        }
        head = new Node(arr[r][c]);
        head.right = build(arr,r,c+1,n,head);
        head.down = build(arr,r+1,c,n,head);
        return head;
    }