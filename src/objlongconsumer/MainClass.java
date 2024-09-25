package objlongconsumer;

import java.util.function.ObjLongConsumer;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ObjLongConsumer<T>
		 * 
		 *         return type: void
		 * 
		 *         method name: accept
		 * 
		 *         numbers of parameters : 2 (T, long)
		 * 
		 */

		ObjLongConsumer<Transaction> setTimestamp = (transaction, timestamp) -> {
			transaction.setTimestamp(timestamp);
			System.out.println("Transaction for " + transaction.getDescription() + " set at timestamp: "
					+ transaction.getTimestamp());
		};

		Transaction purchase = new Transaction("Purchase Order");
		setTimestamp.accept(purchase, System.currentTimeMillis());

	}

}
