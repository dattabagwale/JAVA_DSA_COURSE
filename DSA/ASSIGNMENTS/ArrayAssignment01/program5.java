
// In-Place Prefix Sum

import java.util.*;

class PrefixSum{

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Array : ");

		int n = sc.nextInt();
		
		int arr[] = new int[n];

		System.out.println("Enter the Array Elements : ");

		for(int i=0; i<n; i++){
			
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));

		for(int i=1; i<arr.length; i++){

			arr[i] = arr[i] + arr[i-1];
		}

		System.out.println(Arrays.toString(arr));
	}
}
