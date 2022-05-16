package ch05;
import java.util.*;

public class WildCard {
	public static void main(String[] args) {
		List<?> list = new ArrayList<>();
		list.add("verboten");
	}
}
