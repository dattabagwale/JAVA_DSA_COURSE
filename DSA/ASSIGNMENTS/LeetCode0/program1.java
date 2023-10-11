// Reverse Integer (LeetCode :- 7)
// Handle Overflow and Negative values

import java.util.*;
class ReverseInteger{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Integer : ");
		int x = sc.nextInt();

		// write your code here

		boolean flag = false; // This is for chekcing the Negative Values
		int re = 0;
		int pre = 0; // This varible for checking the overflow
		
		if(x < 0){
			x = -x;
			flag = true;
		}

		while(x > 0){

			int k = x % 10;

			re = (re * 10) + k;


			if((re - k)/10 != pre){
				System.out.println("Overflow Occures");
				break;
			}

			pre = re;
			x = x/10;
		}

		System.out.println((flag)?-re:re);
	}
}
