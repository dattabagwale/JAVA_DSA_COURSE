import java.util.*;

class Factor{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorCount1(n));
		System.out.println(factorCount2(n));
		System.out.println(factorCount3(n));
	}

	public static int factorCount1(int n){

		int count = 0;

		for(int i=1; i<=n; i++){

			if(n%i == 0){
				count++;
			}
		}

		return count;
	}

	public static int factorCount2(int n){

		int count = 1;

		for(int i=1; i<=n/2; i++){
			
			if(n%i == 0){
				count++;
			}
		}
		return count;
	}

	public static int factorCount3(int n){

		int count = 0;

		for(int i=1; i*i <= n; i++){
			
			if(n%i == 0){
				
				if(i == n/i){
					count++;
				}
				else{
					count = count + 2;
				}
			}
		}
		return count;
	}
}
