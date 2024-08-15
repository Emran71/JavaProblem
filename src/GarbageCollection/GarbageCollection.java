package GarbageCollection;

public class GarbageCollection {
		int a;
		int b;
		  public void setData(int c,int d){
		    this.a=c;
		    this.b=d;
		  }
		  public void showData(){
		    System.out.println("Value of a = "+a);
		    System.out.println("Value of b = "+b);
		  }
		  @SuppressWarnings("null")
		public static void main(String args[]){
			  GarbageCollection s1 = new GarbageCollection();
			  GarbageCollection s2 = new GarbageCollection();
		    s1.setData(1,2);
		    s2.setData(3,4);
		    s1.showData();
		    s2.showData();
		    GarbageCollection s3;
		    s3=s2;
		    s3.showData();
		    s2=null;
		    s3.showData();
		    s3=null;
		    s3.showData();
		  }
		
}
