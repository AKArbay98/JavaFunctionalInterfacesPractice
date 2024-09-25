package unaryoperator;

import java.util.function.UnaryOperator;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: UnaryOperator<T>
		 * 
		 *         return type: T
		 * 
		 *         method name: apply(T)
		 * 
		 *         numbers of parameters : 1 (T)
		 * 
		 */

		UnaryOperator<Integer> polynomial = (x) -> (x * x) - (4 * x) + 7;
		Integer apply = polynomial.apply(2);
		System.out.println("Polynomial value is: " + apply);

	}

}
