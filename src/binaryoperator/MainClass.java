package binaryoperator;

import java.util.function.BinaryOperator;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: BinaryOperator<T>
		 * 
		 *         return type: T
		 * 
		 *         method name: apply(T,T)
		 * 
		 *         numbers of parameters : 2 (T, T)
		 * 
		 */

		BinaryOperator<Integer> polynomial = (x, y) -> x + (5 * x * y) + (4 * y * y) + 6;
		Integer resultOfPolynomial = polynomial.apply(2, 3);
		System.out.println(resultOfPolynomial);

	}

}
