package InterfaceClasse;

public class Honda implements Vehicle{

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return 100;
	}

	@Override
	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("break Applied");
	}
	@Override
	public void autopilot() {
		// TODO Auto-generated method stub
		System.out.println("this is honda auto pilot");
	}
	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.applyBreak();
		honda.getSpeed();
		honda.autopilot();//ask how to take the default method with this aolsp
		honda.sayHello();
		Vehicle.sayHello();
	}
	private static  void sayHello() {
		System.out.println("hi this is my honda car");
		
	}

}
