
// Search Insert Postion(LeetCode - 35)


import java.util.*;

class SIP{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array length : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		System.out.println("Enter Array Elements ");
		for(int i=0; i<n; i++){

			arr[i] = sc.nextInt();
		}

		System.out.print("Enter Target Element : ");
		int target = sc.nextInt();


		int start = 0;
		int end = n-1;
		int ans = 0;
		boolean flag = false;

		while(start <= end){

			int mid = end + (start - end)/2;

			if(target > arr[mid]){
				start = mid + 1;
				ans = start;
			}
			else if(target < arr[mid]){
				ans = mid;
				end = mid - 1;
			}
			else{
				System.out.println(mid);
				flag = true;
				break;
			}
		}

		if(!flag){
			System.out.println(ans);
		}
	}
}
