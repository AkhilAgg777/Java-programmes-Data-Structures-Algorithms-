package June20;

public class Matrixrotationby90 {

	public static void main(String[] args) {
int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//Rotating the matrix by swapping the elements
for(int i=0;i<(arr[0].length/2);i++) {
	for(int j=i;j<arr.length-1-i;j++) {
		int temp=arr[i][j];
		arr[i][j]=arr[arr.length-1-j][i];
		arr[arr.length-1-j][i]=arr[arr.length-1-i][arr.length-1-j];
		arr[arr.length-1-i][arr.length-1-j]=arr[j][arr.length-1-i];
		arr[j][arr.length-1-i]=temp;
	}
}

//Rotating the matrix by first transposing & then swapping
/*
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		int temp=arr[i][j];
		arr[i][j]=arr[j][i];
		arr[j][i]=temp;
	}
	}

for(int i=0;i<arr.length/2;i++) {
	for(int j=0;j<arr.length;j++) {
		int temp=arr[j][i];
		arr[j][i]=arr[j][arr.length-1-i];
		arr[j][arr.length-1-i]=temp;
	}
}*/

for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr[0].length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}



	}

}
