package Abstract.Interface;

public interface Area {
   public void getArea(int a, int b);
}
class Rectangle implements Area{
	public void getArea(int a , int b) {
		System.out.println("The Area Of the Rectangle is = "+ a*b);
	}
}
class Square implements Area{
	public void getArea(int a , int b) {
		System.out.println("The Area Of the Square is = "+ a*b);
	}
}
