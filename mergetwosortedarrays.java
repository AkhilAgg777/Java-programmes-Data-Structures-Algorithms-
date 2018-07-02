package July2;

public class mergetwosortedarrays {

	public static int[] merge(int one[],int second[]) {
		
		int i=0,j=0,k=0;
		int sorted[]=new int[one.length+second.length];
		while(i<one.length && j<second.length) {
			if(one[i]<=second[j]) {
				sorted[k]=one[i];
				i++;
				k++;
			}else {
				sorted[k]=second[j];
				j++;
				k++;
			}
		}
		
		while(i<one.length) {
			sorted[k]=one[i];
			i++;k++;
		}
		while(j<second.length) {
			sorted[k]=second[j];
			j++;k++;
		}
		
		return sorted;
	}
	
	public static int[] mergesort(int arr[],int low,int high) {
		
		if(low==high) {
			int ba[]=new int[1];
			ba[0]=arr[low];
			return ba;
		}
		int mid=(low+high)/2;
		int arr1[]=mergesort(arr,low,mid);
		int arr2[]=mergesort(arr,mid+1,high);
		arr=merge(arr1,arr2);
		return arr;
		
	}
	public static void main(String[] args) {
		
		//int one[]= {1,3,7,8,9};
		//int second[]= {2,3,4,6,8,9};
		
		//int sorted[]=merge(one,second);
		int arr[]= {1,5,4,2,9,5,6,7};
		arr=mergesort(arr,0,arr.length-1);
		for(int val:arr) {
			System.out.print(val+" ");
		}
		System.out.println();

	}

}
