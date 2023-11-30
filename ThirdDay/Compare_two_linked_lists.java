link->https://www.geeksforgeeks.org/problems/compare-two-linked-lists/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions



//super easy just take both strings and compare them
int compare(Node node1, Node node2)
    {
      String str1 = "";
      String str2 = "";
      
      while(node1!=null){
          str1+=node1.data;
          node1 = node1.next;
      }
      while(node2!=null){
          str2+=node2.data;
          node2 = node2.next;
      }
      int result = str1.compareTo(str2);
      if(result<0){
          return -1;
      }else if(result>0){
          return 1;
      }
      return result;
}