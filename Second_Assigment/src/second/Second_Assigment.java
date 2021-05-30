package second;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Assigment {
	static Scanner s = new Scanner(System.in);
	
	static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty
        // or contains a single element
        if (n==0 || n==1)
            return n;
      
        int[] temp = new int[n];
         
        // Start traversing elements
        int j = 0;
        for (int i=0; i<n-1; i++)
            // If current element is not equal
            // to next element then store that
            // current element
            if (arr[i] != arr[i+1])
                temp[j++] = arr[i];
         
        // Store the last element as whether
        // it is unique or repeated, it hasn't
        // stored previously
        temp[j++] = arr[n-1];  
         
        // Modify original array
        for (int i=0; i<j; i++)
            arr[i] = temp[i];
      
        return j;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter the Size of Array:");
		int size = s.nextInt();
		
		if(size == 0) {
			System.out.println("Not Found");
			return;
		}
		
		int[] arr = new int[size+1];
		for (int i =1; i < arr.length; i++) {
			System.out.print("Enter "+i+" Element: ");
			arr[i] = s.nextInt();
		}
		
//		System.out.println("Array is Before Sorting:");
//		for(int i = 1; i < arr.length; i++) {
//			System.out.print(arr[i]+"\t");
//		}
//		System.out.println();
		Arrays.sort(arr);
		
		int size2 = removeDuplicates(arr, (arr.length));
		
		System.out.println("Array is After Sorting:");
		for(int i = 1; i < size2; i++) {
			System.out.print(arr[i]+"\t");
		}

	}

}
