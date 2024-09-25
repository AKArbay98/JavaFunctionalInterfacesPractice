package todoublefunction;

import java.util.function.ToDoubleFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ToDoubleFunction<T>
		 * 
		 *         return type: double
		 * 
		 *         method name: applyAsDouble
		 * 
		 *         numbers of parameters : 1 (T)
		 * 
		 */

		ToDoubleFunction<String> stringLength = (str) -> str.length();
		double applyAsDouble = stringLength.applyAsDouble("La Vie en Rose");
		System.out.println(applyAsDouble);

	}

}
