package longsupplier;

import java.util.function.LongSupplier;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: LongSupplier
		 * 
		 *         return type: long
		 * 
		 *         method name: getAsLong
		 * 
		 *         numbers of parameters : 0
		 * 
		 */

		LongSupplier randomLongSupplier = () -> Math.round(Math.random() * Long.MAX_VALUE);
		long asLong = randomLongSupplier.getAsLong();
		System.out.println(asLong);

	}

}
