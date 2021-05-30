package second;

import java.util.Arrays;
import java.util.Scanner;

public class Second_Assigment {
	static Scanner s = new Scanner(System.in);
	
	static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
      
        // To store index of next unique element
        int j = 1;
      
        // Doing same as done in Method 1
        // Just maintaining another updated index i.e. j
        for (int i = 1; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
      
        arr[j++] = arr[n-1];
      
        return j;
    }
	
	static int firstOccPositve(int arr[], int low, int high)
	{
		if(high >= low)
	    {
	        int mid = (low + high)/2; /*low + (high - low)/2;*/
	        if(mid == arr[mid]){
	            return mid;
	        }
	        
	        if(mid > arr[mid]){
	             return firstOccPositve(arr, (mid + 1), high);
	        }

	        else{
	            return firstOccPositve(arr, low, (mid -1));
	        }
	    }
	    return -1;
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
		
		Arrays.sort(arr,1,arr.length);
		
		
		
//		System.out.println("Array is  Sorting:");
//		for(int i = 1; i < arr.length; i++) {
//			System.out.println(arr[i]+"\t"+"index is: "+i);
//		}
//		System.out.println();
		
		int size2 = removeDuplicates(arr, (arr.length));
		
		
//		System.out.println("Array is Delete Dupliate:");
//		for(int i = 1; i < size2; i++) {
//			System.out.println(arr[i]+"\t"+"index is: "+i);
//		}
		
		int index = firstOccPositve(arr,1, (size2-1));
		
		if (index != -1){
	        System.out.println("first positive :"+index);
	       }
	    else{
	    	System.out.println("not found");
	    }
		

	}

}
