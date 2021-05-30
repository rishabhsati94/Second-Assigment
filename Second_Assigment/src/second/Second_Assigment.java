package second;

import java.util.Scanner;

public class Second_Assigment {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Size of Array");
		int size = s.nextInt();
		int[] arr = new int[size+1];
		for (int i =1; i < size+1; i++) {
			System.out.print("Enter "+i+" Element: ");
			arr[i] = s.nextInt();
			System.out.println();
		}
		
		System.out.println("Array is:");
		for(int i = 1; i < size+1; i++) {
			System.out.print(arr[i]+"\t");
		}

	}

}
