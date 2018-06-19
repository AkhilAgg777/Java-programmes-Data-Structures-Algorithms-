package June19;

public class MatrixPrintingwaveform {
	
	

	public static void main(String[] args) {
		int one[][]= {{1,2,3},{4,5,6},{7,8,9}};
				for(int i=0;i<one[0].length;i++) {
			if(i%2==0) {
			for(int j=0;j<one.length;j++)
				System.out.print(one[j][i]+" ");

	}else {
		for(int j=one.length-1;j>=0;j--)
			System.out.print(one[j][i]+" ");
	}
				}

}
}
