package June23;

import java.util.Scanner;

public class BubbleSort {

	public static void bubblesort1(int arr[],int i,int j){
        if(j==0)
            return;
        
        
        if(i<j){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            bubblesort1(arr,i+1,j);
    }else{
            bubblesort1(arr,0,j-1);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        bubblesort1(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        
    }

}
