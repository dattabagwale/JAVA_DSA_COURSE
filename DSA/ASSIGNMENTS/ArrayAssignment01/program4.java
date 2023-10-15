
// Time to Equality

import java.util.*;

class CountOfEqulity{

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Array : ");

		int n = sc.nextInt();
		
		int arr[] = new int[n];

		System.out.println("Enter the Array Elements : ");

		for(int i=0; i<n; i++){
			
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++){

			if(arr[i] > max){
				max = arr[i];
			}
		}

		int ans = 0;

		for(int i=0; i<arr.length; i++){

			ans += max - arr[i];
		}

		System.out.println("Count is : " + ans);
	}
}
