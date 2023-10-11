// Two Sum (LeetCode - 1)

import java.util.*;
class TwoSum{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array Length : ");
	       	int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter Array Element : ");

		for(int i=0; i<n; i++){
			
			arr[i] = sc.nextInt();
		}	

		System.out.println(Arrays.toString(arr));

		System.out.print("Enter Target Element : ");
		int target = sc.nextInt();


		int ans[] = new int[2];

		for(int i=0; i<arr.length; i++){
		
			for(int j=i+1; j<arr.length; j++){
				
				if(arr[i] + arr[j] == target){
					ans[0] = i;
					ans[1] = j;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(ans));
	}
}
