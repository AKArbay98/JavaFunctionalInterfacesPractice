package bifunction;

import java.util.function.BiFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: BiFunction<T, U, R>
		 * 
		 *         return type: R
		 * 
		 *         method name: apply(T,U)
		 * 
		 *         numbers of parameters : 2 (T, U)
		 * 
		 */

		BiFunction<Integer, Integer, Integer> adder = (a, b) -> a + b;
		Integer apply = adder.apply(3, 5);
		System.out.println(apply);

	}

}
