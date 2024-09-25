package longpredicate;

import java.util.function.LongPredicate;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: LongPredicate
		 * 
		 *         return type: boolean
		 * 
		 *         method name: test
		 * 
		 *         numbers of parameters : 1 (long)
		 */

		LongPredicate isNegative = (long value) -> value < 0;
		boolean testNegative = isNegative.test(-340);
		System.out.println(testNegative);

	}

}
