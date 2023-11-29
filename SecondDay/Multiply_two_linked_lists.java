link->https://www.geeksforgeeks.org/problems/multiply-two-linked-lists/1?page=2&category=Linked%20List&difficulty=Easy&sortBy=submissions



public long multiplyTwoLists(Node l1,Node l2){
	long mod = (long)Math.pow(10,9)+7;
	long val1 = getValue(l1,mod);
	long val2 = getValue(l2,mod);

	long ans = ((val1*val2)%mod);
	return ans;
}

//in order to get the value of like a whole of node 
//for exmp 3->2->null , this must be 32 for multiply
//its kind of helper method to help use make number from LL
public long getValue(Node pre,long mod){
	long num = 0;

	while(pre!=null){
		int currValue = pre.data;
		num = (((num*10)%mod)+currValue)%mod;
		pre = pre.next;
	}
	return num;
}