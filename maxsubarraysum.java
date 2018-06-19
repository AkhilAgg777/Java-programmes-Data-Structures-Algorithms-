package June19;

import javax.swing.plaf.synth.SynthSpinnerUI;

import June18.Arrayutils;

//Kadanes Algorithm

public class maxsubarraysum {

	public static void kadanes(int arr[]) {
		int csp = 0, cep = 0, osp = 0, oep = 0;
		int cval = arr[0], oval = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (cval > 0) {
				cval += arr[i];
				cep++;
			} else {
				cval = arr[i];
				csp = i;
				cep = i;
			}
			if (cval > oval) {
				oval = cval;
				osp = csp;
				oep = cep;
			}
		}
		System.out.println(oval);
		for (int i = osp; i <= oep; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		// int arr[]=Arrayutils.takeinput();
		// Arrayutils.display(arr);
		int arr[] = { -5, 2, -1, 3, 6, -11, 8, 9, -14, 5, 6, -4, -5 };
		kadanes(arr);

	}

}
