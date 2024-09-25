package longbinaryoperator;

import java.util.function.LongBinaryOperator;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: LongBinaryOperator
		 * 
		 *         return type: long
		 * 
		 *         method name: applyAsLong
		 * 
		 *         numbers of parameters : 2 (long, long)
		 * 
		 */

		LongBinaryOperator adder = (a, b) -> a * b;
		long applyAsLong = adder.applyAsLong(3L, 4L);
		System.out.println(applyAsLong);

	}

}
