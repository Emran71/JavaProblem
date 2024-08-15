package JavaBasicProgram;

public class StaticVariable {
  int roll;
  String name;
  static String collegeName = "Lyceum College";
  public StaticVariable(int roll, String name) {
	  this.roll = roll;
	  this.name = name;  
  }
  public void display() {
	  System.out.println("Mr/Mrs "+ name +" whos has roll "+ roll + " is read in "+collegeName);
  }
}
 class MainStatic{
	public static void main(String args[]) {
		StaticVariable student1 = new StaticVariable( 001,"Emran Khan" );
		StaticVariable student2 = new StaticVariable( 002,"Abir Khan" );
		student1.display();
		student2.display();
	}
}
