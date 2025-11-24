package p3;

public class P3_main {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(methode(a)); // richtig
		int[] b = {1,-4,-5,5,-2};
		System.out.println(methode(b)); // falsch
		int[] c = {1,-4,-5,4,-2};
		System.out.println(methode(c)); // richtig
		int[] d = {1};
		System.out.println(methode(d)); // richtig
		int[] e = {};
		System.out.println(methode(e)); // richtig
		int[] f = {4,5,3};
		System.out.println(methode(f)); // falsch


	}
	public static int methode(int[] a) {
		int max = -1;
		int k = a.length - 1;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
					if (a[j] > a[i]) {
						max = a[j];
					}
			}
		}
		return max;
	}
	
/*	public static int methode2(int[] a) {
		if ((a.length == 0) || (a.length == 1)) {
			return -1;
		int max = 0;
		for (int i = 0; i < a.length ; i++) {
			int b = a[i];
			if (b < 0) {
				b *= -1;
			}
			if ( b > max) {
				max = b;
			}
		}
		
		}
	}*/

}
