package supplier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: Supplier<T>
		 * 
		 *         return type: T
		 * 
		 *         method name: get()
		 * 
		 *         numbers of parameters : 0
		 * 
		 */

		ArrayList<String> namesFromRadiohead = new ArrayList<>();
		namesFromRadiohead.add("Thom");
		namesFromRadiohead.add("Jonny");
		namesFromRadiohead.add("Colin");
		namesFromRadiohead.add("Phil");
		namesFromRadiohead.add("Clive");
		namesFromRadiohead.add("Ed");

		Supplier<String> firstNameSupplier = () -> namesFromRadiohead.get(0);
		Supplier<String> secondNameSupplier = () -> namesFromRadiohead.get(1);

		System.out.println("First name from Radiohead: " + firstNameSupplier.get());
		System.out.println("Second name from Radiohead: " + secondNameSupplier.get());

		ArrayList<Integer> perfectNumbers = new ArrayList<Integer>();
		perfectNumbers.add(6);
		perfectNumbers.add(28);
		perfectNumbers.add(496);
		perfectNumbers.add(8128);

		Supplier<Integer> removeLastPerfectNumbers = () -> perfectNumbers.removeLast();
		System.out.println("Remove Last Perfect Numbers: " + removeLastPerfectNumbers.get());

		Supplier<LocalDate> dateOne = LocalDate::now;
		Supplier<LocalDate> dateTwo = () -> LocalDate.now();

		LocalDate localDateOne = dateOne.get();
		System.out.println(localDateOne);
		LocalDate localDateTwo = dateTwo.get();
		System.out.println(localDateTwo);

	}

}
