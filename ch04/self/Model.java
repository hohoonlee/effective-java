package ch04.self;

public class Model {
	Controller controller;

	Model(Controller controller) {
		this.controller = controller;
		controller.register(this);
	}

	public void makeChange() {
		System.out.println("Call Model makeChange()");
	}
}
