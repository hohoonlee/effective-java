package ch07;

import java.util.HashMap;
import java.util.Map;

public class MapMerge {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.merge("key0", 1, (count, incr) -> count + incr);
		map.merge("key1", 2, (count, incr) -> count + incr);
		map.merge("key0", 3, (count, incr) -> count + incr);
		map.merge("key1", 4, (count, incr) -> count + incr);

		System.out.println(map);

		map.merge("key0", 5, Integer::sum); //정적 메소드 참조
		System.out.println(map);
	}
}
