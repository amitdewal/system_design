package systemDesign.solid.srp.violation;

public class ViolationDemo {

	public static void main(String[] args) {

		Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
		invoice.calculateTotal();
		invoice.saveToDB();
		invoice.printInvoice();

	}
	
//	
//	Problems with the Above Code
//	The Invoice class has 3 different responsibilities
//	1. calculateTotal() → Responsibility 1: Calculate the total(business logic)
//	2. saveToDB() → Responsibility 2: Database Operations
//	3. printInvoice() → Responsibility 3: Print the Invoice
//	This violates SRP because:
//	If the tax calculation rules change, we need to modify the Invoice class.
//	If the database structure changes, we need to modify the Invoice class.
//	If the printing requirement changes, we need to modify the Invoice class.
}