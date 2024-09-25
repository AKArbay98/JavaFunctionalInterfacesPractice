package longunaryoperator;

import java.util.function.LongUnaryOperator;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: LongUnaryOperator
		 * 
		 *         return type: long
		 * 
		 *         method name: applyAsLong
		 * 
		 *         numbers of parameters : 1 (long)
		 * 
		 */

		LongUnaryOperator mathExpression = d -> Math.abs(d);
		long applyAsLong = mathExpression.applyAsLong(-3L);
		System.out.println(applyAsLong);

	}

}
