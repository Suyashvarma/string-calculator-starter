package calculator;

class StringCalculator {
	int count=0;

    public int add(String input) {
    	count++;
    	if(isEmpty(input))
        return 0;
        if(input.length()==1)
    	return toInt(input);
        String s=",|\n";
        String Array[]=input.split(s); 
        try {
			toInt(Array[0]);
		} catch (NumberFormatException e) {
			s=input.split("\n",2)[0];
			if(s.charAt(0)=='/') {
				s=s.substring(2,s.length());
			}
			Array=input.split("\n",2)[1].split(s);
		}
  
    		return sum(Array);
    	
    }
    
    private boolean isEmpty(String number) {
    	return number.isEmpty();
    }
    
    private int toInt(String number) {
    	return Integer.parseInt(number);
    }
    
    private int sum(String Array[]) {
    	int sum=0;
    	for(String s : Array) {
    		int temp=toInt(s);
    		if(temp<0)
    			System.out.println("negative not allowed"+s);
    		else
    		sum+=temp;
    	}
    	return sum;
    }
    
    public int getCalledCount() {
    	return count;
    }

}