package ch06;

public class WeightTable {
	public static void main(String[] args) {
		double earthWeight = 93;
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for(Planet p : Planet.values()) {
			System.out.printf("%s에서의 무게는 %f이당.%n", p, p.surfaceWeight(mass));
		}
	}
}
