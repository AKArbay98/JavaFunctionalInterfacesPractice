package doublebinaryoperator;

import java.util.function.DoubleBinaryOperator;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: DoubleBinaryOperator
		 * 
		 *         return type: double
		 * 
		 *         method name: applyAsDouble
		 * 
		 *         numbers of parameters : 2 (double,double)
		 * 
		 */

		DoubleBinaryOperator adder = (a, b) -> a * b;
		double applyAsDouble = adder.applyAsDouble(3d, 4d);
		System.out.println(applyAsDouble);

	}

}
