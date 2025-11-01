package systemDesign.solid.isp.solution;

//GOOD: This follows ISP - Multiple focused interfaces following ISP
interface ChefTasks {
	void prepareFood();

	void decideMenu();
}

//GOOD: This follows ISP - Multiple focused interfaces following ISP
interface WaiterTasks {
	void serveFoodAndDrinks();

	void takeOrder();
}

// GOOD: This follows ISP - Multiple focused interfaces following ISP
interface MaintenanceTasks {
	void cleanTheKitchen();

	void reStockGroceries();

//Key Benefits of the Refactored Code
//Prevents bloated classes by having each class implement interfaces that it uses.
//No forced dependencies on irrelevant functionality.
//Cleaner, more maintainable design/code.
//Different Restaurant Employee entities can implement multiple interfaces only when they support those features.
//Summary
//The Interface Segregation Principle (ISP) helps maintain focused classes by ensuring they only implement the
//methods they need. To identify potential violations of the ISP, look for indicators such as low cohesion, large or
//“fat” interfaces, empty methods, and challenging testing scenarios. By recognizing these signs early, you can
//refactor your code to uphold a modular and flexible design.

}

// GOOD: This class follows ISP
// Now classes only implement what they actually need - Clean
//implementations
class Chef implements ChefTasks {

	@Override
	public void prepareFood() {
		System.out.println("Preparing food...");
	}

	@Override
	public void decideMenu() {
		System.out.println("Deciding menu...");
	}
}

//GOOD: This class follows ISP
//Now classes only implement what they actually need - Clean
//implementations
class Waiter implements WaiterTasks {
	@Override
	public void serveFoodAndDrinks() {
		System.out.println("Serving food and drinks...");
	}

	@Override
	public void takeOrder() {
		System.out.println("Taking order...");
	}
}

public class ISP_Solution_Demo {
	public static void main(String[] args) {
		// Create the objects
		// Now classes only implement what they actually support
		Chef chef = new Chef();
		Waiter waiter = new Waiter();

		// Use the objects
		// These work perfectly - no forced implementations
		chef.prepareFood();
		chef.decideMenu();
		// These work perfectly - no forced implementations
		waiter.takeOrder();
		waiter.serveFoodAndDrinks();
	}

}

//Key Benefits of the Refactored Code
//Prevents bloated classes by having each class implement interfaces that it uses.
//No forced dependencies on irrelevant functionality.
//Cleaner, more maintainable design/code.
//Different Restaurant Employee entities can implement multiple interfaces only when they support those features.
//Summary
//The Interface Segregation Principle (ISP) helps maintain focused classes by ensuring they only implement the
//methods they need. To identify potential violations of the ISP, look for indicators such as low cohesion, large or
//“fat” interfaces, empty methods, and challenging testing scenarios. By recognizing these signs early, you can
//refactor your code to uphold a modular and flexible design.
