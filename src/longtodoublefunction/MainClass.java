package longtodoublefunction;

import java.util.function.LongToDoubleFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: LongToDoubleFunction
		 * 
		 *         return type: double
		 * 
		 *         method name: applyAsDouble
		 * 
		 *         numbers of parameters : 1 (long)
		 * 
		 */

		LongToDoubleFunction convertToDouble = x -> (double) x * x;
		double applyAsDouble = convertToDouble.applyAsDouble(10L);
		System.out.println(applyAsDouble);

	}

}
