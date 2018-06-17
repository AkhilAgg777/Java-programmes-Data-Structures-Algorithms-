package june16;
import java.util.Scanner;

public class SqaurRootIntegralAndPrecision {
public static int sqrt1(int n){
        
        if(n==0||n==1)
            return n;
        
        int res=1,i=1;
        while(res<=n){
            i++;
            res=i*i;
        }
        
        return i-1;
    }
public static double sqrt2(int n,int p){
   if(n==0||n==1)
       return n;
double ans=1;
    int i=1; 
    while(ans<=n){
        i++;
        ans=i*i;
    }
    
    ans=i-1;
    float increment=(float)(0.1);
    int pow=1;
    double pow2=1.0;
    for(int j=0;j<p;j++){
        while(ans*ans<=n){
            ans=ans+increment;
        }
        ans=ans-increment;
        pow*=10;
        pow2*=10.0;
        increment=increment/10;
    }
    return (Math.round(ans*pow)/pow2);
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
		//int n=27;
     int p=sc.nextInt();
		//int p=2;
        int res1=sqrt1(n);
    double res2=sqrt2(n,p);
        System.out.println(res1+" "+res2);		

	}

}
