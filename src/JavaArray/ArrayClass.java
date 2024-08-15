package JavaArray;

public class ArrayClass {
  public static void calmin(int arr[]) {
	  int min= arr[0];
	  for(int i=1;i<arr.length;i++) 
		  if(min>arr[i])
		  
			 min = arr[i]; 
		  
		System.out.println(min);
	  
	  
  }
  public static void main(String args[]) {
	  int arr[] ={10,20,5,30,15};
	  calmin(arr);
  }
}
