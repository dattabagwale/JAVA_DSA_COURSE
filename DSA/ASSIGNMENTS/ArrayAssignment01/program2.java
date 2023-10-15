
// Linear Search - Multiple Occurance

import java.util.*;

class CountOfValue{

	public static void main(String[] args){


		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Array : ");

		int n = sc.nextInt();
		
		int arr[] = new int[n];

		System.out.println("Enter the Array Elements : ");

		for(int i=0; i<n; i++){
			
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the value for count : ");
		int b = sc.nextInt();

		int count = 0;

		for(int i=0; i<arr.length; i++){

			if(arr[i] == b){
				count++;
			}
		}

		System.out.println("The Count is : " + count);
	}
}
