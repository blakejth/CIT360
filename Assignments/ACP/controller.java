package apc;

import java.util.HashMap;

public class controller {

	public static HashMap<String, Operation> hashMapOperand = new HashMap<String, Operation>();
	public Controller() {

	}


	public Integer hashMaps(String operation, Integer firstNumber, Integer secondNumber) {
		hashMapOperand.put(operation, new math();)
		operation math = hashMapOperand.get(operation);
		return(math.numbers(firstNumber, secondNumber));
	}
	
}