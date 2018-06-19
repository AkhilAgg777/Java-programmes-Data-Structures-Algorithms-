package June19;

public class MatrixMult {

	public static void mult(int one[][], int two[][]) {
		if (one[0].length != two.length)
			System.out.println("Not possible");
		else {
			int r1 = one.length;
			int c1 = one[0].length;
			int r2 = two.length;
			int c2 = two[0].length;
			int cd = r2;
			int third[][] = new int[r1][c2];
			for (int i = 0; i < third.length; i++) {

				for (int j = 0; j < third[0].length; j++) {
					for (int k = 0; k < cd; k++)
						third[i][j] += (one[i][k] * two[k][j]);
				}
			}
			display(third);
		}
		

	}

	public static void display(int one[][]) {
		for (int i = 0; i < one.length; i++) {
			for (int j = 0; j < one[0].length; j++) {
				System.out.print(one[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("///////////////////////");
	}

	public static void main(String[] args) {
		int one[][] = { { 1, 0, 5, 0 }, { 2, 0, 0, 2 } };
		int two[][] = { { 10, 1, 1 }, { 1, 10, 1 }, { 1, 1, 10 }, { 0, 0, 0 } };
		display(one);
		display(two);
		mult(one, two);

	}

}
