package doublesupplier;

import java.util.function.DoubleSupplier;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: DoubleSupplier
		 * 
		 *         return type: double
		 * 
		 *         method name: getAsDouble
		 * 
		 *         numbers of parameters : 0
		 * 
		 */

		DoubleSupplier randomDoubleSupplier = () -> Math.random();
		double asDoubleRandom = randomDoubleSupplier.getAsDouble();
		System.out.println(asDoubleRandom);

	}

}
