package Lab2;

import java.util.*;

public class lab2_1 {
	public static int plusNum(int arr[]) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) 
		{
			if(i%2!=0)
				sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] array = new int[] {5, 8, -4, 11, -3};
		System.out.print ("Масив:");
		for (int i = 0; i < array.length; i++) {
		    System.out.print(" " + array[i]);
		}
		System.out.println("\nCумa елементів одновимірного масиву із n елементів цілого типу з непарними індексами: "+plusNum(array));
	}
}
