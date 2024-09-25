package intsupplier;

import java.util.function.IntSupplier;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: IntSupplier
		 * 
		 *         return type: int
		 * 
		 *         method name: getAsInt
		 * 
		 *         numbers of parameters : 0
		 * 
		 */

		IntSupplier randomIntSupplier = () -> (int) Math.random();
		int asIntRandom = randomIntSupplier.getAsInt();
		System.out.println(asIntRandom);

	}

}
