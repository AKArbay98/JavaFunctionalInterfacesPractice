package doubletolongfunction;

import java.util.function.DoubleToLongFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: DoubleToLongFunction
		 * 
		 *         return type: long
		 * 
		 *         method name: applyAsLong
		 * 
		 *         numbers of parameters : 1 (double)
		 * 
		 */

		DoubleToLongFunction convertToLong = x -> (long) x;

		long applyAsLong = convertToLong.applyAsLong(3.14);
		System.out.println(applyAsLong);

	}

}
