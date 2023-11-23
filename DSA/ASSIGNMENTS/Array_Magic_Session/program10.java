import java.util.*;

class Demo{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Array Length : ");
		int n = sc.nextInt();

		int arr[] = new int[n];
		
		System.out.println("Enter array Elements : ");
		for(int i=0; i<n; i++){
		
			arr[i] = sc.nextInt();
			
		}

		int ans = n*(n+1)/2;
		System.out.println("The Number of SubArrays are : " + ans);
	}
}
