package ch05;

import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.function.UnaryOperator;

public class SetUnion {
	public static Set union(Set s1, Set s2) {
		Set result = new HashSet(s1);
		result.addAll(s2);
		return result;
	}

	public static <E> Set<E> gunion(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	private static UnaryOperator<Object> IDENTITY_FN = (t) -> t;

	@SuppressWarnings("unchecked")
	public static <T> UnaryOperator<T> identityFunction() {
		return (UnaryOperator<T>) IDENTITY_FN;
	}

	public static <E extends Comparable<E>> E max(Collection<E> c) {
		if(c.isEmpty()) throw new IllegalArgumentException();

		E result = null;
		for(E e : c) {
			if(result == null || e.compareTo(result) > 0) result = Objects.requireNonNull(e);
		}
		return result;
	}

	public static void main(String[] args) {
		Set s1 = new HashSet();
		s1.add("Hello");

		Set s2 = new HashSet();
		s2.add("World");

		System.out.println(SetUnion.union(s1, s2));

		Set<String> guys = Set.of("톰", "딕", "해리");
		Set<String> stooges = Set.of("래리", "모에", "컬리");
		Set<String> aflCio = gunion(guys, stooges);
		System.out.println(aflCio);

		String[] strings = {"삼베", "대마", "나일론"};
		UnaryOperator<String> sameString = identityFunction();
		for(String s: strings) {
			System.out.println(sameString.apply(s));
		}

		Number[] numbers = {1, 2.0, 3L, 1_000};
		UnaryOperator<Number> sameNumber = identityFunction();
		for(Number n : numbers) {
			System.out.println(sameNumber.apply(n));
		}
	}
}
