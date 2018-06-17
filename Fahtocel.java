package june16;

import java.util.Scanner;

public class Fahtocel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int fmin=sc.nextInt();
		int fmax=sc.nextInt();
		int step=sc.nextInt();
		for(int i=fmin;i<=fmax;i+=step) {
			double cel=(5.0/9.0)*(i-32);
			int out = (int)(cel);
			System.out.println(i+" "+out);
		}

	}

}
