package acessmodifier;
 class RBI{
	int rateOfInterest(){
		return 0;
	}
}
 class SBI extends RBI{
	 @Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 12;
	}
 }
 class icici extends RBI{
	 int rateOfInterest() {
		 return 23;
	 }
 }
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome world");
icici i =  new icici();
SBI s = new SBI();
System.out.println(i.rateOfInterest());
System.out.println(s.rateOfInterest());
	}
	

}
