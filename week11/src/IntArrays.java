
public class IntArrays {
	private static java.util.Random random = new java.util.Random();

	public static boolean isSorted(int[] a) {
		for (int i = 1; i < a.length; i++)
			if (a[i] < a[i - 1])
				return false;
		return true;
	}

	public static void print(int[] a) {
		System.out.print("{" + a[0]);
		for (int i = 1; i < a.length; i++)
			System.out.print("," + a[i]);
		System.out.println("}");
	}

	public static int[] randomInts(int n, int range) {
		int[] a = new int[n];
		if (n < 2)
			throw new IllegalArgumentException();
		for (int i = 0; i < n; i++)
			a[i] = random.nextInt(range);
		return a;
	}

	public static int[] resize(int[] a, int n) {
		if (n < a.length)
			throw new IllegalArgumentException();
		int[] aa = new int[n];
		System.arraycopy(a, 0, aa, 0, a.length);
		return aa;
	}

	public static void swap(int[] a, int i, int j) {
		int ai = a[i], aj = a[j];
		if (ai == aj)
			return;
		a[i] = aj;
		a[j] = ai;
	}
}
