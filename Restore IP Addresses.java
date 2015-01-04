public class Solution {
	private List<String> result = new ArrayList<String>();
	private int pos[] = new int[4];
	
    public List<String> restoreIpAddresses(String s) {
    	dfs(0, 4, s, 0);
    	return result;
    }
    
    /**
     * ��ȱ������н�
     * @param dep
     * @param maxDep
     * @param s
     * @param start
     */
    private void dfs(int dep, int maxDep, String s, int start){
    	if(dep == maxDep){
    		if(start == s.length()){
    			int startPosition = 0;
    			int endPosition = pos[0];
    			String Ip = "";
    			for(int i = 0; i < pos.length; i++){			//��ʼ�и���ȷ��ip��
    				
    				String tempIp = s.substring(startPosition, endPosition);
    				Ip += i != pos.length - 1 ? tempIp + "." : tempIp;
    				startPosition = endPosition;
    				if(i != pos.length - 1)
    					endPosition = pos[i + 1];
    				else
    					endPosition = s.length();
    			}
    			result.add(Ip);
    		}
    		return;
    	}
    	
    	//dfs�������н�
    	for(int i = start + 1; i <= s.length(); i++){
    		String temp = s.substring(start, i);
    		
    		if(temp.length() < 4 && isValid(temp))
    		{
    			pos[dep] = i;									//��¼��ip��λ��
    			dfs(dep + 1, maxDep, s, i);
    		}
    	}
    }
    
    /**
     * �ж�Ip�Ƿ�Ϊ��Чֵ
     * @param ip
     * @return
     */
    private boolean isValid(String ip){
    	if(ip.length() == 1 && Integer.valueOf(ip) >= 0 && Integer.valueOf(ip) <= 9)
    		return true;
    	else if(ip.length() == 2 && Integer.valueOf(ip) >= 10 && Integer.valueOf(ip) <= 99)
    		return true;    	
    	else if(ip.length() == 3 && Integer.valueOf(ip) >= 100 && Integer.valueOf(ip) <= 255)
    		return true;
    	return false;
    }
}