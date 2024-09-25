package function;

import java.util.ArrayList;
import java.util.function.Function;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: Function<T, R>
		 * 
		 *         return type: R
		 * 
		 *         method name: apply(T)
		 * 
		 *         numbers of parameters : 1 (T)
		 * 
		 */

		Function<Integer, Integer> square = (x) -> x * x;
		int result = square.apply(5);
		System.out.println("Square of 5: " + result);

		Function<String, Integer> lengthOfString = x -> x.length();
		int apply = lengthOfString.apply("arbay");
		System.out.println(apply);

		ArrayList<String> modernistComposers = new ArrayList<>();
		modernistComposers.add("Debussy");
		modernistComposers.add("Satie");
		modernistComposers.add("Mahler");
		modernistComposers.add("Schreker");
		modernistComposers.add("Ornstein");
		modernistComposers.add("Carter");

		Function<String, String> newComposersName = x -> x.replace("e", "s");
		for (int i = 0; i < modernistComposers.size(); i++) {
			System.out.println(newComposersName.apply(modernistComposers.get(i)));
		}

	}

}
