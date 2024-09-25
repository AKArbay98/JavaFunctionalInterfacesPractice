package intpredicate;

import java.util.function.IntPredicate;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: IntPredicate
		 * 
		 *         return type: boolean
		 * 
		 *         method name: test
		 * 
		 *         numbers of parameters : 1 (int)
		 * 
		 */

		IntPredicate isEven = (int number) -> number % 2 == 0;
		boolean testEven = isEven.test(77);
		System.out.println(testEven);

	}

}
