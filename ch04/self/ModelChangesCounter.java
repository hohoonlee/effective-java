package ch04.self;

public class ModelChangesCounter {
	private Model model;
	private int counter = 0;

	ModelChangesCounter(Model model) {
		this.model = model;
	}

	public void makeChage() {
		model.makeChange();
		counter++;
		System.out.println("counter:" + counter);
	}
}
