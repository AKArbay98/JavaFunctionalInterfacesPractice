package longconsumer;

import java.util.function.LongConsumer;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: LongConsumer
		 * 
		 *         return type: void
		 * 
		 *         method name: accept
		 * 
		 *         numbers of parameters : 1 (long)
		 * 
		 */

		LongConsumer printFormattedLong = (long value) -> {
			System.out.println(value);
		};
		printFormattedLong.accept(11031998);

	}

}
