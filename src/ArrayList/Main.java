package ArrayList;

import java.util.ArrayList;
public class Main {
  public static void main(String[] args) {
	  ArrayList<String> animals = new ArrayList<>();
	  animals.add("Dog");
	  animals.add("cate");
	  animals.add("Oxy");
	  System.out.println("ArryList" + animals);
	  for(String lan : animals) {
		  System.out.print(lan);
		  System.out.print(",");
	  }
}
}
