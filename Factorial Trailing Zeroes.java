public class Solution {
    public int trailingZeroes(int n) {
        int numsOf2 = 0;
        int numsOf5 = 0;
        for(int i = 2; i <= n; i++){
        	numsOf2 += get2nums(i);
        	numsOf5 += get5nums(i);
        }
        return numsOf2 < numsOf5 ? numsOf2 : numsOf5;
    }
    
    /**
     * ����num��2��Ϊ�˻����ӵĸ���
     * @param num
     * @return
     */
    private int get2nums(int num){
    	int numsOf2 = 0;
    	if(num % 2 != 0)
    		return 0;
    	else{
    		while(num % 2 == 0){
    			num = num / 2;
    			numsOf2 ++;
    		}
    	}
    	return numsOf2;
    }
    
    /**
     * ��ȡ5�ĸ���
     * @param num
     * @return
     */
    private int get5nums(int num){
    	int numsOf5 = 0;
    	if(num % 5 != 0)
    		return 0;
    	else{
    		while(num % 5 == 0){
    			num = num / 5;
    			numsOf5 ++;
    		}
    	}
    	return numsOf5;
    }
}