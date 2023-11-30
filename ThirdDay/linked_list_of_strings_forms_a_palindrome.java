link->https://www.geeksforgeeks.org/problems/linked-list-of-strings-forms-a-palindrome/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions




public static boolean compute(Node node){
        String str = "";
        while(node!=null){
            str+=node.data;
            node = node.next;
        }
        int first = 0;
        int last = str.length()-1;
        while(first<=last){
            char firstChar = str.charAt(first);
            char lastChar = str.charAt(last);
            if(firstChar != lastChar){
                return false;
            }
            first++;
            last--;
        }
       
       
        return true;
    }