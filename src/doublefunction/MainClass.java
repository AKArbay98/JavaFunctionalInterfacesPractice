package doublefunction;

import java.util.function.DoubleFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: DoubleFunction<R>
		 * 
		 *         return type: R
		 * 
		 *         method name: apply
		 * 
		 *         numbers of parameters : 1 (double)
		 * 
		 */

		DoubleFunction<String> celsiusToFahrenheit = celsius -> {
			double fahrenheit = (celsius * 9 / 5) + 32;
			return String.format("%.2f°C is %.2f°F", celsius, fahrenheit);
		};
		String apply = celsiusToFahrenheit.apply(36.5);
		System.out.println(apply);

	}

}
