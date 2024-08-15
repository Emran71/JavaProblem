package JavaArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
     public static void main(String[] args) {
		int a[] = new int[5];
		try (Scanner sc = new Scanner(System.in)) {
			for(int i=0;i<a.length;i++) {
				System.out.println("Enter the value "+i+": ");
				a[i]=sc.nextInt();
			}
		}
		System.out.println("The array list......");
		System.out.println(Arrays.toString(a));
	}
}
