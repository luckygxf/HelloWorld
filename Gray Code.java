public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        for(int i = 0; i < n; i++){
        	int highest = 1 << i;
        	int sizeOfList = result.size();
        	for(int j = sizeOfList - 1; j >= 0; j--){
        		int temp = result.get(j) + highest;
        		result.add(temp);
        	}
        }
        
        return result;
    }
}