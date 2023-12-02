link-> https://www.geeksforgeeks.org/problems/arrange-consonants-and-vowels/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions



//create two other LL and merge them

public Node arrangeCV(Node head){
        Node help = head;
        Node nonVowelStart = new Node('0');
        Node nonVowel = nonVowelStart;
        Node vowelStart = new Node('0');
        Node vowel = vowelStart;
        
        if(head.next == null){
            return head;
        }
        
         while(help!=null){
             char ch = help.data;
             boolean check = voWelCheck(ch);
             Node alphabet = new Node(ch);
             if(check){
                 vowel.next = alphabet;
                 vowel = vowel.next;
             }else{
                 nonVowel.next = alphabet;
                 nonVowel = nonVowel.next;
             }
             help = help.next;
         }
         vowel.next = nonVowelStart.next;
         nonVowel.next = null;
         return vowelStart.next;
    }
    public static boolean voWelCheck(char ch){
        if(ch=='a' ||ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u' ){
            return true;
        }
        return false;
    }