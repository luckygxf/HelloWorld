import java.util.ArrayList;

public class Solution {
    public int numTrees(int n) {
        List<Integer> count = new ArrayList<Integer>();
        count.add(1);
        count.add(1);
        count.add(2);
        if(n <= 2)
        	return count.get(n);
        
        for(int i = 3; i <= n;i++){
        	int temp = 0;
        	for(int j = 1;j <= i;j++){
        		temp += count.get(j - 1) * count.get(i - j);        		
        	}
        	count.add(temp);
        }
        
        return count.get(count.size() - 1);
    }
}