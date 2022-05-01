package ch02;

public class Calzone  extends Pizza{
	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder<Builder> {
		private boolean sourceInside = false;

		public Builder sourceInside() {
			this.sourceInside = true;
			return this;
		}

		@Override
		public Calzone build() {
			return new Calzone(this);
		}

		@Override
		protected Builder self() {
			return this;
		}

	}

	private Calzone(Builder builder) {
		super(builder);
		sauceInside = builder.sourceInside;
	}

}
