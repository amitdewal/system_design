package systemDesign.solid.srp.solution;

//Usage example showing how all classes work together
public class SolutionDemo {
	public static void main(String[] args) {
		// create the service objects
		Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
		InvoiceDao invoiceDao = new InvoiceDao(invoice);
		InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

		// use the services
		invoice.calculateTotal();
		invoiceDao.saveToDB();
		invoicePrinter.print();
	}
}

//Key Benefits of the Refactored Code
//Single Responsibility: Each class now has only one reason to change
//Invoice : Only changes if the Invoice tax calculation rules change
//InvoiceDao : Only changes if InvoiceDao database operations change
//InvoicePrinter : Only changes if InvoicePrinter requirements change
//Better Maintainability: Changes to one functionality don't affect others.
//Improved Testability: Each class can be tested in isolation.
//Enhanced Reusability: Classes can be reused in different contexts. For example, different types of
//invoices(domestic and international) can use the same InvoicePrinter class.


//Summary
//The Single Responsibility Principle (SRP) is key to maintainable, testable, and flexible code. It ensures each class
//has one reason to change, fostering a modular system. SRP isn’t about limiting classes to a single method, but
//rather about ensuring they have one responsibility, even with multiple methods that align with that purpose.

