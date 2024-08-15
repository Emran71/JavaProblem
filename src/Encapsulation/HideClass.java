package Encapsulation;

public class HideClass {
   private String name;
   public String getter() {
	   return name;
   }
   public void setter(String name) {
	   this.name= name;
   }
   public void display() {
	   System.out.println(name);
   }
}
class AccessClass {
	public static void main(String args[]) {
		HideClass hc = new HideClass();
		hc.setter("Emran khan");
		hc.display();
	}
}
