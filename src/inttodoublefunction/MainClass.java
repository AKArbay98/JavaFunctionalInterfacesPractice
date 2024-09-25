package inttodoublefunction;

import java.util.function.IntToDoubleFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: IntToDoubleFunction
		 * 
		 *         return type: double
		 * 
		 *         method name: applyAsDouble
		 * 
		 *         numbers of parameters : 1 (int)
		 * 
		 */

		IntToDoubleFunction squareRootFunction = (int value) -> Math.sqrt(value);
		double applyAsDouble = squareRootFunction.applyAsDouble(25);
		System.out.println(applyAsDouble);

	}

}