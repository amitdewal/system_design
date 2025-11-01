package systemDesign.solid.dip.solution;

import systemDesign.solid.dip.violation.BluetoothKeyboard;
import systemDesign.solid.dip.violation.BluetoothMouse;
import systemDesign.solid.dip.violation.Keyboard;
import systemDesign.solid.dip.violation.Mouse;
import systemDesign.solid.dip.violation.WiredKeyboard;
import systemDesign.solid.dip.violation.WiredMouse;

//Following DIP
//High-level module uses abstraction
class MacBook {
	private final Keyboard keyboard;
	private final Mouse mouse;

//Abstraction - defines contract
//Dependency injection through constructor
	MacBook(Mouse mouse, Keyboard keyboard) {
		this.keyboard = keyboard; // Works with any kind of keyboard and mouse
		this.mouse = mouse;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}
}

// Usage example - following DIP
public class DIP_Solution_Demo {
	public static void main(String[] args) {
// create keyboard and mouse objects
		WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell", "F602", "Grey");
		WiredMouse wiredMouse = new WiredMouse("USB", "Dell", "F602", "Grey");
		BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");

		BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");

// Can easily create macbooks with different combinations of keyboard and mouse

// create macbook with wired keyboard and mouse
		MacBook macBookWithWiredParts = new MacBook(wiredMouse, wiredKeyboard);
		macBookWithWiredParts.getKeyboard().getSpecifications();
		macBookWithWiredParts.getMouse().getSpecifications();

// create macbook with bluetooth keyboard and mouse
		MacBook macBookWithBluetoothParts = new MacBook(bluetoothMouse, bluetoothKeyboard);
//		macBookWithBluetoothParts.getKeyboard().getSpecifications();
		macBookWithBluetoothParts.getMouse().getSpecifications();
	}
}

//Key Benefits of the Refactored Code
//BluetoothKeyboard and BluetoothMouse depend only on the respective Keyboard and
//Mouse abstractions.
//Any different MacBook parts can be injected without changing the MacBook .
//Easy to mock for testing.
//New MacBook parts can be added without touching existing code.
//Summary
//The solution demonstrates true dependency inversion because the high-level module ( MacBook ) and low-level
//modules ( BluetoothKeyboard , BluetoothMouse , WiredKeyboard, WiredMouse ) both
//depend on the same abstraction ( Keyboard and Mouse ), and the abstraction doesn't depend on any
//concrete implementation details.
