package tolongbifunction;

import java.util.function.ToLongBiFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ToLongBiFunction<T, U>
		 * 
		 *         return type: long
		 * 
		 *         method name: applyAsLong
		 * 
		 *         numbers of parameters : 2 (T, U)
		 * 
		 */

		ToLongBiFunction<Integer, Double> mathematicalExpression = (x, y) -> (long) ((Math.exp(x) * Math.E) + y);
		long applyAsLong = mathematicalExpression.applyAsLong(3, 4.4d);
		System.out.println(applyAsLong);

	}

}
