package todoublebifunction;

import java.util.function.ToDoubleBiFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ToDoubleBiFunction<T, U>
		 * 
		 *         return type: double
		 * 
		 *         method name: applyAsDouble
		 * 
		 *         numbers of parameters : 2 (T, U)
		 * 
		 */

		ToDoubleBiFunction<Integer, Integer> calculateArea = (length, width) -> (double) (length * width);
		double applyAsDouble = calculateArea.applyAsDouble(5, 6);
		System.out.println(applyAsDouble);

	}

}
