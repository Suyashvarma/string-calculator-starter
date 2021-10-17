package calculator;

class StringCalculator {

    public int add(String input) {
    	String Array[]=input.split(","); 
    	if(input.equals(""))
        return 0;
    	else if(input.length()==1)
    	return Integer.parseInt(input);
    	else 
    		return Integer.parseInt(Array[0])+Integer.parseInt(Array[1]);
    	
    }

}