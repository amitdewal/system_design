package systemDesign.solid.ocp.vilotion;

import systemDesign.solid.srp.violation.Invoice;
import systemDesign.solid.srp.violation.Marker;

//Usage example - showing the problem
public class ViolationDemo {
 public static void main(String[] args) {
     Invoice invoice = new Invoice(new Marker("name", "color", 10, 2020), 10);
     invoice.calculateTotal();

     InvoiceDao databaseFileSave = new InvoiceDao(invoice);
     databaseFileSave.saveToDB(); // Save to DB
     databaseFileSave.saveToFile(); // Save to File

     // Problem: If we want to add a new function like saveToMongoDB(),
     // we need to modify InvoiceDao and all its derived classes(if exists)
     // This violates the "closed for modification" part of OCP
 }
}

/*
 * Problems with the Above Code Modification Required: Every time we add a new
 * type of save functionality(let’s say saveToMongoDB() ), we must modify the
 * existing InvoiceDao class. Risk of Breaking Existing Code: Changes might
 * introduce bugs in working functionality, i.e., the InvoiceDao class that is
 * already deployed in the production environment. Testing Issues: Need to
 * retest all existing functionality when adding new save operations.
 */

