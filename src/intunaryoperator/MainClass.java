package intunaryoperator;

import java.util.function.IntUnaryOperator;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: IntUnaryOperator
		 * 
		 *         return type: int
		 * 
		 *         method name: applyAsInt
		 * 
		 *         numbers of parameters : 1 (int)
		 * 
		 */

		IntUnaryOperator negativeOperand = i -> -i;
		int applyAsInt = negativeOperand.applyAsInt(4);
		System.out.println(applyAsInt);

	}

}
