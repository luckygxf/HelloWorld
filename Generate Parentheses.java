public class Solution {
	List<String> ans = new ArrayList<String>();
	
    public List<String> generateParenthesis(int n) {
        StringBuffer cur = new StringBuffer();
        getAns(cur.toString(), n, n);
    	return ans;
    }
    private void getAns(String cur, int n, int m){
    	if(0 == n && m == 0){
    		ans.add(cur);
    		System.out.println(cur.toString());
//    		cur.delete(0, cur.length());
//    		cur = new StringBuffer("");
    	}
    	if(n != 0){
    	
    		getAns(cur + "(", n - 1, m);
    	}
    	if(n < m && m != 0){
    		
    		getAns(cur + ")", n, m - 1);
    	}
    }
}