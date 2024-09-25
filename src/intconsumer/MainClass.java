package intconsumer;

import java.util.function.IntConsumer;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: IntConsumer
		 * 
		 *         return type: void
		 * 
		 *         method name: accept
		 * 
		 *         numbers of parameters : 1 (int)
		 * 
		 */

		IntConsumer printFormattedInteger = (int value) -> {
			System.out.printf("Formatted value: %d%n", value);
		};

		printFormattedInteger.accept(36);

	}

}
