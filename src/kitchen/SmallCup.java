package kitchen;

import world.*;

public class SmallCup extends Cup {

	private final int MAX_VOLUME = 250;

	public SmallCup(Liquid liquid) {
		setLiquid(liquid);
	}

	@Override
	public void setLiquid(Liquid liquid) {

		if (liquid.getVolume() > MAX_VOLUME)
			System.err.printf("This cup can't contain more than %dml of liquid!%n", MAX_VOLUME);
		else
			this.liquid = liquid;
	}
}