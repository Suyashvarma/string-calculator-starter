package calculator;

class StringCalculator {

    public int add(String input) {
    	String Array[]=input.split(","); 
    	if(isEmpty(input))
        return 0;
    	else if(input.length()==1)
    	return toInt(input);
    	else 
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
    		sum+=toInt(s);
    	}
    	return sum;
    }

}