package tolongfunction;

import java.util.function.ToLongFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ToLongFunction<T>
		 * 
		 *         return type: long
		 * 
		 *         method name: applyAsLong
		 * 
		 *         numbers of parameters : 1 (T)
		 * 
		 */

		ToLongFunction<String> stringHashCode = str -> str.hashCode();
		long applyAsLong = stringHashCode.applyAsLong("Nights in White Satin");
		System.out.println(applyAsLong);

	}

}
