package ch04.self;

public class Client {
	public static void main(String[] args) {
		Controller ctl0 = new Controller();
		Model model = new Model(ctl0);
		ModelChangesCounter modelChangesCounter = new ModelChangesCounter(model);
		ctl0.doChange();
	}
}
