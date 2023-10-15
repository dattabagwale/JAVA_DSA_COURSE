
// Product Array Puzzle

import java.util.*;

class ArrayProduct{

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Array : ");

		int n = sc.nextInt();
		
		int arr[] = new int[n];

		System.out.println("Enter the Array Elements : ");
		int product = 1;
		for(int i=0; i<n; i++){
			
			arr[i] = sc.nextInt();
			product = product * arr[i];
		}

		System.out.println(Arrays.toString(arr));

		for(int i=0; i<arr.length; i++){

			int quotient = 0;
			int divisor = arr[i];
			int pro = product;

			while(pro >= divisor){

				pro = pro - divisor;
				quotient++;
			}

			arr[i] = quotient;
			
		}

		System.out.println(Arrays.toString(arr));
	}
}
