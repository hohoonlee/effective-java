package ch02;

import static ch02.Pizza.Topping.*;
import static ch02.NyPizza.Size.*;

public class PizzaClient {
	public static void main(String[] args) {
		NyPizza pizza = new NyPizza.Builder(SMALL)
							.addTopping(SAUSAGE)
							.addTopping(ONION)
							.build();
		System.out.println("pizza:" + pizza);

		Calzone calzone = new Calzone.Builder()
							.addTopping(HAM)
							.build();
		System.out.println("calzone:" + calzone);
	}

}
