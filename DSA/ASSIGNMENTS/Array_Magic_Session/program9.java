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
	
		System.out.println("Enter the Number : ");
		int x = sc.nextInt();

		int ans[] = new int[]{-1,-1};

		for(int i=0; i<arr.length; i++){
			if(arr[i] == x){
				ans[0] = i;
				break;
			}
		}

		for(int i=arr.length-1; i>=0; i--){

			if(arr[i] == x){
				ans[1] = i;
				break;
			}
		}

		System.out.println(Arrays.toString(ans));
	}
}
