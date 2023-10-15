
// Leader in an Array

import java.util.*;

class LeadersArray{

	public static void main(String[] args){
		

		List<Integer> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of Array : ");

		int n = sc.nextInt();
		
		int arr[] = new int[n];

		System.out.println("Enter the Array Elements : ");

		for(int i=0; i<n; i++){
			
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		int max = Integer.MIN_VALUE;
		for(int i=arr.length-1; i>=0; i--){
			
			if(arr[i] > max){
				max = arr[i];
				al.add(max);
			}
		}

		System.out.println(al);
	}
}
