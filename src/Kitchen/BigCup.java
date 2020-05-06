package Kitchen;

import World.*;

public class BigCup extends Cup {

	private final int MAX_VOLUME = 1000;

	public BigCup(Liquid liquid){
		setLiquid(liquid);
	}

	@Override
	public void setLiquid(Liquid liquid) {
		liquid.setMaxVolume(MAX_VOLUME);

		if (liquid.getVolume() > MAX_VOLUME)
			System.err.printf("This cup can't contain more than %dml of liquid!%n", MAX_VOLUME);
		else
			this.liquid = liquid;
	}
}
