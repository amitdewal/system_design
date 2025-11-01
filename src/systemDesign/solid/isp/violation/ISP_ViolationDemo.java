/**
 * 
 */
package systemDesign.solid.isp.violation;

//What is the Interface Segregation Principle (ISP)?
//Interface Segregation Principle (ISP) states that “clients should not be forced to depend on
//interfaces they don't use. Instead of having one large interface with many methods, 
//it'sbetter to have multiple smaller, focused interfaces”.
// That means, Interfaces should be such that the client should NOT implement unnecessary functions they do not
//need.

// BAD: This class violates ISP
// This is a fat interface
// One large interface forcing all implementers to define unused methods
interface RestaurantEmployee {
	void prepareFood();

	void decideMenu();

	void serveFoodAndDrinks();

	void takeOrder();

	void cleanTheKitchen();

}

//BAD: This class violates ISP(clients shouldn't depend on unused interfaces)
//Bloated class with empty or error-throwing methods
//This Waiter is forced to implement methods it doesn't need
class Waiter implements RestaurantEmployee {
	@Override
	public void takeOrder() {
		System.out.println("Taking order...");
	}

	@Override
	public void serveFoodAndDrinks() {
		System.out.println("Serving food and drinks...");
	}

	@Override
	public void cleanTheKitchen() {
		// Forced to implement but doesn't make sense for a waiter
		throw new AssertionError("Detail Message: Waiter cannot clean the kitchen!");
	}

	@Override
	public void prepareFood() {
		// Forced to implement but doesn't make sense for a waiter
		throw new AssertionError("Detail Message: Waiter cannot prepare food!");
	}

	@Override
	public void decideMenu() {
		// Forced to implement but doesn't make sense for a waiter
		throw new AssertionError("Detail Message: Waiter cannot decide the menu!");
	}

}

//Usage example - showing the problem
public class ISP_ViolationDemo {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		// Works fine
		waiter.takeOrder();
		waiter.serveFoodAndDrinks();

		// These will throw exceptions
		waiter.prepareFood(); // forced implementation
		waiter.decideMenu(); // forced implementation
		waiter.cleanTheKitchen(); // forced implementation
	}

}

//Problems with the Above Code
//Classes are forced to implement methods they don't support.
//Results in AssertionError being thrown.
//Code becomes bloated with empty or error-throwing methods.
//Violates the principle that clients shouldn't depend on unused interfaces.
