package objintconsumer;

import java.util.function.ObjIntConsumer;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ObjIntConsumer<T>
		 * 
		 *         return type: void
		 * 
		 *         method name: accept
		 * 
		 *         numbers of parameters : 2 (T, int)
		 * 
		 */

		ObjIntConsumer<Product> updateStock = (product, quantity) -> {
			int newStock = product.getStock() + quantity;
			product.setStock(newStock);
			System.out.println("Updated stock for " + product.getName() + ": " + product.getStock());
		};

		Product product = new Product("Mobile Phone", 15);
		updateStock.accept(product, 10);

	}

}
