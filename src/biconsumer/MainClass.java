package biconsumer;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: BiConsumer<T, U>
		 * 
		 *         return type: void
		 * 
		 *         method name: accept(T,U)
		 * 
		 *         numbers of parameters : 2 (T, U)
		 * 
		 */

		BiConsumer<Integer, Integer> printSum = (x, y) -> System.out.println("Sum: " + (x + y));
		printSum.accept(2, 4);

		BiConsumer<String, Integer> messageConsumer = (name, age) -> {
			System.out.println(name + " is " + age + " years old.");
		};
		messageConsumer.accept("Ali Kaan", 26);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
		b2.accept("lion", 1);
		b2.accept("chicken", 2);

	}

}
