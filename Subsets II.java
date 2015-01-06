import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	private List<List<Integer>> result = new ArrayList<List<Integer>>();	
	
	public List<List<Integer>> subsetsWithDup(int[] num) {
    	List<Integer> subSet = new ArrayList<Integer>();
    	Arrays.sort(num);
        dfs(0, num, subSet);
        
        return result;
    }
    
    private void dfs(int start, int S[], List<Integer> subSet){
    	if(start ==  S.length){
    		List<Integer> temp = new ArrayList<Integer>(subSet);
    		if(!result.contains(temp))
    			result.add(temp);
    		return ;
    	}else{
    		dfs(start + 1, S, subSet);				//不放到集合中
    		subSet.add(S[start]);					//放到子集中
    		dfs(start + 1, S, subSet);
    		if(subSet.size() > 0)
    			subSet.remove(subSet.size() - 1);
    	}
    }
}