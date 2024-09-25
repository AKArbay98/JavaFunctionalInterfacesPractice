package consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: Consumer<T>
		 * 
		 *         return type: void
		 * 
		 *         method name: accept(T)
		 * 
		 *         numbers of parameters : 1 (T)
		 * 
		 */

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);

		Consumer<Integer> printNumberConsumer = number -> System.out.println(number);
		numbers.forEach(printNumberConsumer);

		ArrayList<String> oscarMovies = new ArrayList<String>();
		oscarMovies.add("Forrest Gump");
		oscarMovies.add("Braveheart");
		oscarMovies.add("American Beauty");
		oscarMovies.add("Schindler's List");
		oscarMovies.add("Titanic");

		Consumer<String> printOscarMovies = movies -> System.out.println(movies.toUpperCase());
		oscarMovies.forEach(printOscarMovies);

		Consumer<String> consumerOne = System.out::println;
		Consumer<String> consumerTwo = x -> System.out.println(x);
		consumerOne.accept("Bob");
		consumerTwo.accept("Alice");

	}

}
