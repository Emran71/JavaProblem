package Aggrigation;

public class EmployeeClass {
   int id;
   String name;
   Address addr;
   public EmployeeClass(int id, String name, Address addr) {
	   this.id = id;
	   this.name = name;
	   this.addr = addr;
   }
   public void display() {
	   System.out.println(id +"  "+ name);
	   System.out.println(addr.city+"  "+ addr.state+"  "+ addr.country);
   }
}
class MainAssertion{
	public static void main(String[]args) {
		Address add1 = new Address("Dhaka","Dhaka","Bangladesh");
		Address add2 = new Address("Dhaka","Tangail","Bangladesh");
		EmployeeClass em1 = new EmployeeClass(101,"Abir Khan",add1);
		EmployeeClass em2 = new EmployeeClass(102,"Emran Khan",add2);
		em1.display();
		em2.display();
	}
}
   