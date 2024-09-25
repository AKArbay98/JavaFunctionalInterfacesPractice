package intfunction;

import java.util.function.IntFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: IntFunction<R>
		 * 
		 *         return type: R
		 * 
		 *         method name: apply
		 * 
		 *         numbers of parameters : 1 (int)
		 * 
		 */

		IntFunction<String> intToString = i -> Integer.toString(i);
		String result = intToString.apply(42);
		System.out.println(result);

	}

}
