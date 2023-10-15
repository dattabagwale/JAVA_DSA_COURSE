
// Range sum Query

import java.util.*;

class RangeSum{

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

		System.out.print("Enter Total No. of Query : ");
	       	int q = sc.nextInt();	

		for(int i=1; i<arr.length; i++){

			arr[i] = arr[i] + arr[i-1];
		}

		System.out.println(Arrays.toString(arr));

		while(q-- > 0){

			System.out.print("Enter Start Value : ");
			int start = sc.nextInt();

			System.out.print("Enter End Value : ");
			int end = sc.nextInt();
			int ans = 0;
			if(start != 0)
				ans = arr[end] - arr[start-1];
			

			if(start == 0)
		 		ans = arr[end];
			
			System.out.println("Answer is : " + ans);
		

		
		}

	}
}
