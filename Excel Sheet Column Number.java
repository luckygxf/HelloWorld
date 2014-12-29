public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = 0; i < s.length(); i++){
        	char ch_temp = s.charAt(i);
        	int int_temp = ch_temp - 'A' + 1;
        	result *= 26;
        	result += int_temp;
        }
        return result;
    }
}