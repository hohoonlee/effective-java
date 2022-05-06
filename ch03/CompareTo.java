package ch03;
import java.math.*;
import java.util.*;

public class CompareTo {
	public static void main(String[] args) {
		BigDecimal	b1 = new BigDecimal("1.0");
		BigDecimal	b2 = new BigDecimal("1.00");

		System.out.println("1.0 equals 1.00 : " + (b1.equals(b2)));
		System.out.println("1.0 compareTod 1.00 : " + (b1.compareTo(b2)));

		Set<BigDecimal> hashSet = new HashSet<>();
		Set<BigDecimal> treeSet = new TreeSet<>();

		hashSet.add(b1);
		treeSet.add(b1);

		hashSet.add(b2);
		treeSet.add(b2);

		System.out.println("hashSet:" + hashSet);
		System.out.println("treeSet:" + treeSet);
	}
}