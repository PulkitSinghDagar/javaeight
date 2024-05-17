package InterfaceClasse;

public interface Vehicle {
	public int getSpeed();
	public void applyBreak();
	
	
	default 	public  void autopilot() {
		System.out.println("this car is auto pilot");
	}
public static void sayHello() {
	System.out.println("hi this is you fav car");
}
}
