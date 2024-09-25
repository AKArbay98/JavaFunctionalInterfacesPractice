package objdoubleconsumer;

import java.util.function.ObjDoubleConsumer;

public class MainClass {

	public static void main(String[] args) {

		/**
		 * @author Ali Kaan Arbay
		 * 
		 *         functional interface name: ObjDoubleConsumer<T>
		 * 
		 *         return type: void
		 * 
		 *         method name: accept
		 * 
		 *         numbers of parameters : 2 (T, double)
		 * 
		 */

		ObjDoubleConsumer<Product> applyDiscount = (product, discount) -> {

			double newPrice = product.getPrice() - (product.getPrice() * discount);
			product.setPrice(newPrice);
			System.out.println("Product after discount: " + product.getName() + " - $" + product.getPrice());
		};

		Product mobilePhone = new Product("Mobile Phone", 500.0);

		applyDiscount.accept(mobilePhone, 0.15);

	}

}
