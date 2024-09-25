package booleansupplier;

import java.util.function.BooleanSupplier;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: BooleanSupplier
		 * 
		 *         return type: boolean
		 * 
		 *         method name: getAsBoolean
		 * 
		 *         numbers of parameters : 0
		 * 
		 */

		BooleanSupplier booleanExpression = () -> Math.random() > 0.5;
		boolean asBoolean = booleanExpression.getAsBoolean();
		System.out.println(asBoolean);

	}

}
