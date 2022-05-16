package ch05;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Favorites {
	private Map<Class<?>, Object> favorites = new HashMap<>();

	public <T> void putFavorite(Class<T> type, T instance) {
		favorites.put(Objects.requireNonNull(type), instance);
	}

	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}

	public static void main(String[] args) {
		Favorites f = new Favorites();

		f.putFavorite(String.class, "Java");
		f.putFavorite(Integer.class, 500);
		f.putFavorite(Class.class, Favorites.class);


		String favoriteString = f.getFavorite(String.class);
		int favoriteInt = f.getFavorite(Integer.class);
		Class<?> favoriteClass = f.getFavorite(Class.class);

		System.out.printf("%s %x %s %n", favoriteString, favoriteInt, favoriteClass);
	}
}
