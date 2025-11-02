package systemDesign.solid.design.pattern.creational.singleton;

// 1. Eager Initialization- Singleton
public class DBConnectionEager {
	// the single instance , created immediately

	private static final DBConnectionEager instance = new DBConnectionEager();

	// The private constructor prevents instantiation
	private DBConnectionEager() {

	}

	// method to return the unique instance of this class
	public static DBConnectionEager getInstance() {
		return instance;
	}
	
	
	// method to display a message
	public void displayMessage() {
		System.out.println("Eager Initialization - Singleton- "+ this);
	}
}


