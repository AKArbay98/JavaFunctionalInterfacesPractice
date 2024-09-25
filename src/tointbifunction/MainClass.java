package tointbifunction;

import java.util.function.ToIntBiFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ToIntBiFunction<T, U>
		 * 
		 *         return type: int
		 * 
		 *         method name: applyAsInt
		 * 
		 *         numbers of parameters : 2 (T, U)
		 * 
		 */

		ToIntBiFunction<Integer, Long> mathematicalExpression = (x, y) -> (int) ((Math.exp(x) * Math.E) + y);
		int applyAsInt = mathematicalExpression.applyAsInt(3, 4L);
		System.out.println(applyAsInt);

	}

}
