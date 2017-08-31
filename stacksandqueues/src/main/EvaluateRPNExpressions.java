import java.util.*;

public class EvaluateRPNExpressions {

    /*
    8.2
    */

    public static Integer eval(String RPNExpression) {
    	Deque<Integer> intermediateResults = new ArrayDeque<>();
    	String delimiter = ",";
    	String[] symbols = RPNExpression.split(delimiter);
    	for (String token : symbols) {
    		if (token.length() == 1 && "+-*/".contains(token)) {
    			final int y = intermediateResults.removeFirst();
    	        final int x = intermediateResults.removeFirst();
    	        switch (token.charAt(0)) {
    	        	case '+':
    	        		intermediateResults.addFirst(x + y);
    	        		break;
    	        	case '-':
    	        		intermediateResults.addFirst(x - y);
    	        		break;
    	        	case '*':
    	        		intermediateResults.addFirst(x * y);
    	        		break;
    	        	case '/':
    	        		intermediateResults.addFirst(x / y);
    	        		break;
    	        	default:
    	        		throw new IllegalArgumentException("Malformed RPN at :" + token);
    	        }
    		}
    		else { // token is a number.
    			intermediateResults.addFirst(Integer.parseInt(token));
    		}
    	}
    	return intermediateResults.removeFirst();
    }
}