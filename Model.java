
public class Model {
	private double displayValue;
	private double internalValue;
	private String displayString;
	private String operation;
	private boolean start;
    
    
	public Model() {
		displayValue = 0.0;
		displayString = "" + displayValue;
		internalValue = 0;
		start = true;
		operation = "";
	}
	
	public String getValue() {
		return displayString;
	}
	
	public void update(String text) {
		if (start) {	
			internalValue = displayValue;
			displayValue = 0;
			displayString = "";
			start = false;
			
		}
		if (text.length() == 1 && "0123456789".indexOf(text) >= 0) {
			displayString += text;
			displayValue = Double.valueOf(displayString);
		} 
		else {
		    if (operation.equals("+")) {
				displayValue = internalValue + displayValue;
			} else if (operation.equals("-")) {
				displayValue = internalValue - displayValue;
			} else if (operation.equals("*")) {
				displayValue = internalValue * displayValue;
			} else if (operation.equals("/")) {
				displayValue = internalValue / displayValue;
			}
			displayString = "" + displayValue;
			internalValue = displayValue;
			operation = text;
			start = true;
		}
	}
}
