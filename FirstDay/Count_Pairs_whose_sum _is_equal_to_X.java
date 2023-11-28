link-> https://www.geeksforgeeks.org/problems/count-pairs-whose-sum-is-equal-to-x/1?page=1&category=Linked%20List&difficulty=Easy&sortBy=submissions 


public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2,int x) {
	//storing the values to find
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int val1: head1){
            set.add(val1);
        }
        for(int val2:head2){
            if(set.contains(x-val2)){
                count++;
            }
        }
        return count;
    }