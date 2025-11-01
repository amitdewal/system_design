package systemDesign.solid.dip.violation;

// VIOLATION OF DIP



public class DIP_Violation_Demo {
	public static void main(String[] args) {

		// create keyboard and mouse objects
		WiredKeyboard wiredKeyboard = new WiredKeyboard("USB", "Dell", "F602", "Grey");
		WiredMouse wiredMouse = new WiredMouse("USB", "Dell", "F602", "Grey");
		BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard("Bluetooth", "Logitech", "G102", "Black");
		BluetoothMouse bluetoothMouse = new BluetoothMouse("Bluetooth", "Logitech", "G102", "Black");

		// create macbook
		MacBook macBookWithWiredParts = new MacBook(wiredKeyboard, wiredMouse);
		macBookWithWiredParts.getKeyboard().getSpecifications();
		macBookWithWiredParts.getMouse().getSpecifications();

		// create macbook with bluetooth keyboard and mouse
		// MacBook macBookWithBluetoothParts = new MacBook(bluetoothKeyboard,
		// bluetoothKeyboard);
		// cannot create macbook with bluetooth keyboard and mouse because
		// macbook depends on wired keyboard and mouse - tight coupling - violation of
		// DIP
	}

//	Problems with the Above Code
//	The MacBook is tightly coupled to the WiredKeyboard and the WiredMouse .
//	Cannot create MacBook objects with different parts without modifying the MacBook class.
//	Difficult to test MacBook in isolation
//	High-level module MacBook depends on low-level module WiredKeyboard and the WiredMouse .

}
