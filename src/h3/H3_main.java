package h3;

public class H3_main {

	public static void main(String[] args) {
		/*int[] a={1,2,3}, b={1,2,4}, c={1,3,2}, d={1,2}, e={1,2,3},  f={1,1,2};
		System.out.println(compareArraysVal(a,b));
		System.out.println(compareArraysVal(a,c));
		System.out.println(compareArraysVal(a,d));
		System.out.println(compareArraysVal(a,e));
		System.out.println(compareArraysVal(b,d));
		System.out.println(compareArraysVal(c,e));
		System.out.println(compareArraysVal(f,c));*/



	}

	public static boolean compareArraysVal(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		int c1;
		int c2;
		for (int i = 0; i < a.length; i++) {
			c1 = 0;
			c2 = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					c1++;
				}
				if (a[i] == b[j]) {
					c2++;
				}
			}
			if (c1 != c2) {
				return false;
			}
		}
		return true;
	}
}
