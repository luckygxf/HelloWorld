class MinStack {
    	List<Integer> stack = new ArrayList<Integer>();
	int top = -1;
	int min = Integer.MAX_VALUE;

    public void push(int x) {
        top++;
        stack.add(x);
        if(min > x){
        	min = x;
        
        }
        	
    }

    public void pop() {

        int element = stack.remove(top--);
        if(element == min)
        {        	
        		updateMin();            
        		
        }
    }

    public int top() {
        int result = stack.get(top);
      
        return result;
    }

    public int getMin() {
        
        return this.min;
    }
    public void updateMin(){
    	if(top == -1)
    	{
    	    min = Integer.MAX_VALUE;	    
    	    return;
    	}
    	min = stack.get(0);
    	for(int i = 1; i <= top; i++){
    		if(min > stack.get(i))
    			min = stack.get(i);
    	}
    }
}
