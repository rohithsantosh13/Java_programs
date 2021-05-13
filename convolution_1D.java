import java.util.Scanner;

public class convolution_1D {
	static void convolution(int[] a, int[] b) {
		int as = a.length;
		int bs = b.length;
		int la[][] = new int[as][bs];

		for (int i = 0; i < as; i++) {
			for (int j = 0; j < bs; j++) {
				la[i][j] = b[i] * a[j];
			}
		}
		int con[] = new int[as + bs - 1];
		int i = 0, j = 0, s = 0;
		for (int k = 0; k < as + bs - 1; k++) {
			for (i = 0; i < as; i++) {
				for (j = 0; j < bs; j++) {
					if (i + j == k)
						s = s + la[i][j];
				}
			}
			con[k] = s;
			s = 0;
		}
		for (int h : con)
			System.out.print(h + " ");

	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int as = sc.nextInt();
			int a[] = new int[as];
			for (int i = 0; i < as; i++) {
				a[i] = sc.nextInt();
			}
			int bs = sc.nextInt();
			int b[] = new int[bs];
			for (int i = 0; i < bs; i++) {
				b[i] = sc.nextInt();
			}
			convolution(a, b);
		}
	}
}