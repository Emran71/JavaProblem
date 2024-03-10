package InnerClass;

public class Animal {
 class Raptile{
	 void DisplayInfo() {
		 System.out.println("I am Raptile");
	 }
 }
 static class Mammel{
	 void DisplayInfo() {
		 System.out.println("I am Mammel");
	 }
 }
 class Main{
	 public static void main(String[] args) {
		Animal a = new Animal();
		Animal.Raptile rap = a.new Raptile();
		rap.DisplayInfo();
	}
 }
}
