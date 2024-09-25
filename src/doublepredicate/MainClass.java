package doublepredicate;

import java.util.function.DoublePredicate;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: DoublePredicate
		 * 
		 *         return type: boolean
		 * 
		 *         method name: test
		 * 
		 *         numbers of parameters : 1 (double)
		 * 
		 */

		DoublePredicate isPositive = (value) -> value > 0;
		boolean isPositiveDoublePredicate = isPositive.test(11.03);
		boolean isPositiveDoublePredicateTwo = isPositive.test(-4.3);
		System.out.println(isPositiveDoublePredicate);
		System.out.println(isPositiveDoublePredicateTwo);
	}

}
