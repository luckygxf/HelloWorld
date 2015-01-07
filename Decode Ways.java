public class Solution {
    public int numDecodings(String s) {
    	if(0 == s.length() || s.charAt(0) == '0')
    		return 0;
        int ways[] = new int[s.length() + 1];
        for(int i = 0; i <= s.length(); i++){
        	if(i == 1 || i == 0){
        		ways[i] = 1;
        	}
        	else{
        		if(i < s.length() && s.charAt(i) == '0')
        		{
        			ways[i] = ways[i - 1];
        			continue;
        		}
        		String subStr = s.substring(i - 2, i);
        		int num = Integer.valueOf(subStr);
        		if(num == 0)
        			return 0;
        		if(num > 26 && num % 10 == 0)
        			return 0;
        		else if(num <= 26 && s.charAt(i - 1) != '0' && s.charAt(i - 2) != '0')
        			ways[i] = ways[i - 1] + ways[i - 2];
        		else
        			ways[i] = ways[i - 1];        		
        	}//else
        }//for
        
        return ways[s.length()];
    }
}