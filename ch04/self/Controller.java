package ch04.self;

public class Controller {
	private Model model;

	public void register(Model model) {
		this.model = model;
	}

	public void doChange() {
		model.makeChange();
	}

}
