package june16;

import java.util.Scanner;

public class validitycheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int first=sc.nextInt();
		int second=sc.nextInt();
		
		boolean goingup=second>first;
	for(int i=3;i<=n;i++) {
		if(goingup==false) {
			if(second>first) {
				goingup=true;
			}
		}else {
			if(second<first) {
				System.out.println("Invalid");
				return;
			}
		}
			
		
		first=second;
		second=sc.nextInt();
		
	}
		
		System.out.println("Valid");
			
}
}
