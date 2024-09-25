package bipredicate;

import java.util.function.BiPredicate;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: BiPredicate<T, U>
		 * 
		 *         return type: boolean
		 * 
		 *         method name: test(T,U)
		 * 
		 *         numbers of parameters : 2 (T, U)
		 * 
		 */

		BiPredicate<Integer, Integer> isEqual = (x, y) -> x == y;
		boolean isEqualTest = isEqual.test(4, 3);
		System.out.println(isEqualTest);

	}

}
