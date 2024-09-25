package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: Predicate<T>
		 * 
		 *         return type: boolean
		 * 
		 *         method name: test(T)
		 * 
		 *         numbers of parameters : 1 (T)
		 * 
		 */

		ArrayList<String> bestUniversitiesMathematics = new ArrayList<String>();
		bestUniversitiesMathematics.add("University of Cambridge");
		bestUniversitiesMathematics.add("University of Oxford");
		bestUniversitiesMathematics.add("ETH Zurich");
		bestUniversitiesMathematics.add("Rheinische Friedrich-Wilhelms-Universität Bonn");
		bestUniversitiesMathematics.add("Imperial College London");
		bestUniversitiesMathematics.add("Lomosonov Moscow State University");

		Predicate<String> filtering = university -> university.contains("College");

		List<String> list = bestUniversitiesMathematics.stream().filter(filtering).toList();
		System.out.println(list);

	}

}
