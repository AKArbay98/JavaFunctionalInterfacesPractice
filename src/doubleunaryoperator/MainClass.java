package doubleunaryoperator;

import java.util.function.DoubleUnaryOperator;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: DoubleUnaryOperator
		 * 
		 *         return type: double
		 * 
		 *         method name: applyAsDouble
		 * 
		 *         numbers of parameters : 1 (double)
		 * 
		 */

		DoubleUnaryOperator mathExpression = d -> Math.cos(d);
		double applyAsDouble = mathExpression.applyAsDouble(90);
		System.out.println(applyAsDouble);

	}

}
