package systemDesign.solid.ocp.solution;

import systemDesign.solid.srp.solution.Invoice;
import systemDesign.solid.srp.solution.Marker;

//Usage demonstrating OCP compliance
public class SolutionDemo {
	public static void main(String[] args) {
		Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
		invoice.calculateTotal();

		InvoiceDao databaseInvoiceDao = new DatabaseInvoiceDao(invoice);
		databaseInvoiceDao.save(); // Save to DB

		InvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
		fileInvoiceDao.save(); // Save to File

		// The system is:
		// - OPEN for extension (new save functions can be added)
		// - CLOSED for modification (existing code remains unchanged)
	}
}

//Key Benefits of the Refactored Code
//Reduced risk: Existing tested code remains unchanged.
//Better maintainability: New features don't break existing functionality.
//Improved flexibility: Easy to add new behaviors without touching existing code.
//Enhanced testability: New extensions can be tested independently.
//Supports polymorphism: Enables dynamic behavior through interfaces and inheritance.

//Summary
//By adhering to the Open/Closed Principle (OCP), developers can construct software architectures that are both
//adaptable and resilient, allowing them to evolve and expand without compromising existing functionalities.

//This principle emphasizes the importance of abstraction and the creation of well-defined interfaces,
//which not only accommodate current requirements but also anticipate future enhancements.

//Systems designed with OCP in mind enhance robustness and maintainability, increase the longevity and scalability
//of software solutions, and reduce the risk of introducing defects during changes.
