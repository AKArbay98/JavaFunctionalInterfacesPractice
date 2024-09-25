package intbinaryoperator;

import java.util.function.IntBinaryOperator;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: IntBinaryOperator
		 * 
		 *         return type: int
		 * 
		 *         method name: applyAsInt
		 * 
		 *         numbers of parameters : 2 (int, int)
		 * 
		 */

		IntBinaryOperator adder = (a, b) -> a * b;
		int applyAsInt = adder.applyAsInt(3, 4);
		System.out.println(applyAsInt);

	}

}
