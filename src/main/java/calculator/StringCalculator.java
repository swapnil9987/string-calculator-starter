package calculator;

class StringCalculator {

    public void add(String input) {
    	if(input.length() == 0) {
    		return;
    		
    		else{
    			String delimiter = ",";
    			if(text.matches("//(.*)\n(.*)")){
    				delimiter = Character.toString(text.charAt(2));
    				text = text.substring(4);
    			}
    			
    			String numList[] = splitNumbers(text, delimiter + "|\n");
    			return sum(numList);
    		}	
    }
    private static int toInt(String number){
    	return Integer.parseInt(number);
    	}
    
    private static String[] splitNumbers(String numbers, String divider){
	    return numbers.split(divider);
	}
    
    private static String[] MulNumbers(String numbers, int numbers1){
	    return numbers.MulNumbers(numbers1);
	}
    
    private static int sum(String[] numbers){
 	    int total = 0;
 	    String negString = "";

        for(String number : numbers){
        	if(toInt(number) < 0){
        		if(negString.equals(""))
        			negString = number;
        		else
        			negString += ("," + number);
        	}
        	if(toInt(number) < 1000)
		    	total += toInt(number);
		}

		if(!negString.equals("")){
			throw new IllegalArgumentException("Negatives not allowed: " + negString);
		}

		return;
		
		if(MulNumbers.equals(String))
			multiply = 
    }

}
}
