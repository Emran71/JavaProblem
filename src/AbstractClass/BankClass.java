package AbstractClass;

public abstract class BankClass {
   abstract void savings();
}
class Janata extends BankClass{

	@Override
	void savings() {
		System.out.println("No Interest");
		
	}
	
}
class ExecutionPart{
	public static void main(String args[]) {
		BankClass b = new Janata();
		b.savings();
	}
}