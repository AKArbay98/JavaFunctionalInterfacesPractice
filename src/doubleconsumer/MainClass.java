package doubleconsumer;

import java.util.function.DoubleConsumer;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: DoubleConsumer
		 * 
		 *         return type: void
		 * 
		 *         method name: accept
		 * 
		 *         numbers of parameters : 1 (double)
		 * 
		 */

		DoubleConsumer printFormattedDouble = (double value) -> {
			System.out.printf("Formatted value: %.2f%n", value);
		};

		printFormattedDouble.accept(11.03);

	}

}
