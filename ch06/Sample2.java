package ch06;

public class Sample2 {
	@ExceptionTest({ArithmeticException.class})
	public static void m1() {
		int i = 0;
		i = i / 1;
	}

	@ExceptionTest({ArithmeticException.class})
	public static void m2() {
		int[] a = new int[0];
		int i = a[1];
	}

	@ExceptionTest({ArithmeticException.class})
	public static void m3() {}
}
