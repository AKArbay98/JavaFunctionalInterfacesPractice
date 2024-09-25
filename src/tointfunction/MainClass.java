package tointfunction;

import java.util.function.ToIntFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ToIntFunction<T>
		 * 
		 *         return type: int
		 * 
		 *         method name: applyAsInt
		 * 
		 *         numbers of parameters : 1 (T)
		 * 
		 */

		ToIntFunction<String> indexOf = str -> str.lastIndexOf("m");
		int applyAsInt = indexOf.applyAsInt("deneme");
		System.out.println(applyAsInt);

	}

}
