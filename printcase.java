package june16;

import java.util.Scanner;

public class printcase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
char ch=sc.nextLine().charAt(0);
if(ch>='a'&&ch<='z')
	System.out.println((char)(ch-' '));
else if(ch>='A'&&ch<='Z')
	System.out.println((char)(ch+' '));
	


	}

}
