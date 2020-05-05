package Kitchen;

import World.*;

public class SmallCup extends Cup {

	public SmallCup(Liquid liquid) {
		setLiquid(liquid);
	}

	@Override
	public void setLiquid(Liquid liquid) {
		liquid.setMaxVolume(250);

		if (liquid.getVolume() > liquid.getMaxVolume())
			System.err.printf("This cup can't contain more than %dml of liquid!%n", liquid.getMaxVolume());
		else
			this.liquid = liquid;
	}
}
