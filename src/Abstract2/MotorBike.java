package Abstract2;

abstract class Bike {
	
   abstract void sound();
   
}
class Honda extends Bike{
	
	public void sound() {
		System.out.println("Honda Sound");
	}
}
class Yamaha extends Bike {
	
	public void sound() {
		System.out.println("Yamaha sound");
	}
}
public class MotorBike{
	public static void main(String[] args) {
		Honda h = new Honda();
		h.sound();
		Yamaha y = new Yamaha();
		y.sound();
	}
	
}
