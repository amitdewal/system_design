package systemDesign.solid.ocp.vilotion;
/*What is the Open/Closed Principle (OCP)?

Open/Closed Principle(OCP) states that “A class should be open for extension but closed
for modification”.

This means that new functionality can be added through extension (inheritance, composition, interfaces) rather
than by modifying existing code. As existing code is already tested and deployed in production, adding
modifications would introduce an additional risk and require additional testing effort.*/

import systemDesign.solid.srp.violation.Invoice;

//Responsibility: Managing Database Operations only
	public class InvoiceDaoOld {

	    Invoice invoice;

	    public InvoiceDaoOld(Invoice invoice) {
	        this.invoice = invoice;
	    }

	    public void saveToDB() {
	        // Save into the DB the invoice
	        System.out.println("Saving to DB...");
	    }


}
