package ch06;

public class Sample {
	@Test
	public static void m1() {};

	public static void m2() {};

	@Test
	public static void m3() {
		throw new RuntimeException("ERROR");
	}

	@Test
	public void m5() {}

	public static void m8() {}
}