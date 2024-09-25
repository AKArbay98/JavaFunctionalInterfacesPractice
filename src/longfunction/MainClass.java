package longfunction;

import java.util.function.LongFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: LongFunction<R>
		 * 
		 *         return type: R
		 * 
		 *         method name: apply
		 * 
		 *         numbers of parameters : 1 (long)
		 * 
		 */

		LongFunction<Double> mathematicalExpression = a -> a / 2.0;
		Double apply = mathematicalExpression.apply(3);
		System.out.println(apply);

	}

}
