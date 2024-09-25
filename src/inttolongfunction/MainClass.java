package inttolongfunction;

import java.util.function.IntToLongFunction;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: IntToLongFunction
		 * 
		 *         return type: long
		 * 
		 *         method name: applyAsLong
		 * 
		 *         numbers of parameters : 1 (int)
		 * 
		 */

		IntToLongFunction converterIntToLong = s -> s * 4;
		long applyAsLong = converterIntToLong.applyAsLong(45);
		System.out.println(applyAsLong);

	}

}
