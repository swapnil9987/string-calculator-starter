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

}
}
