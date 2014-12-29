public class Solution {
    public int compareVersion(String version1, String version2) {    	
        String ver1_ch[] = version1.split("\\.");
        String ver2_ch[] = version2.split("\\.");
               
        int i = 0;
        for(; i < ver1_ch.length && i <ver2_ch.length; i++){
        	
        	if(Integer.valueOf(ver1_ch[i]) > Integer.valueOf(ver2_ch[i]))
        		return 1;
        	else if(Integer.valueOf(ver1_ch[i]) < Integer.valueOf(ver2_ch[i]))
        		return -1;
        }
        if(i >= ver1_ch.length && i >= ver2_ch.length)
        	return 0;
        else if(i >= ver1_ch.length){
        	for(; i < ver2_ch.length; i++){
        		if(Integer.valueOf(ver2_ch[i]) > 0)
        			return -1;
        	}
        	return 0;
        }
        else
    	{
	    	for(; i < ver1_ch.length; i++){
	    		if(Integer.valueOf(ver1_ch[i]) > 0)
	    			return 1;
	    	}
	    	return 0;
    	}
    }
}