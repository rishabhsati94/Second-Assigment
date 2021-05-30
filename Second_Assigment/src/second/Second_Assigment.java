package second;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Assigment {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Size of Array:");
		int size = s.nextInt();
		
		if(size == 0) {
			System.out.println("Not Found");
			return;
		}
		
		int[] arr = new int[size+1];
		for (int i =1; i < size+1; i++) {
			System.out.print("Enter "+i+" Element: ");
			arr[i] = s.nextInt();
		}
		
		System.out.println("Array is Before Sorting:");
		for(int i = 1; i < size+1; i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		Arrays.sort(arr);
		
		System.out.println("Array is After Sorting:");
		for(int i = 1; i < size+1; i++) {
			System.out.print(arr[i]+"\t");
		}

	}

}
