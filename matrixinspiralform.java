package June19;

public class matrixinspiralform {

	public static void main(String[] args) {
		int one[][]= {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{13,14,15}};
		int count=0;
		int rs=0,cs=0;
		int re=one.length-1,ce=one[0].length-1;
		
		while(count<(one.length*one[0].length)) {
		
			for(int j=rs;j<=re;j++) {
				if(count<(one.length*one[0].length)) {
				System.out.print(one[j][cs]+" ");
			count++;
				}
		}
			cs++;
			for(int j=cs;j<=ce;j++) {
				if(count<(one.length*one[0].length)) {
				System.out.print(one[re][j]+" ");
				count++;
				}
			}
			re--;
			for(int j=re;j>=rs;j--) {
				if(count<(one.length*one[0].length)) {
				System.out.print(one[j][ce]+" ");
				count++;
				}
			}
			ce--;
			for(int j=ce;j>=cs;j--) {
				if(count<(one.length*one[0].length)) {
				System.out.print(one[rs][j]+" ");
				count++;
				}
			}
			rs++;
			
		}

	}

}
