package Kitchen;

import World.*;

public class BigCup extends Cup {

	public BigCup(Liquid liquid){
		setLiquid(liquid);
	}

	@Override
	public void setLiquid(Liquid liquid) {
		liquid.setMaxVolume(1000);

		if (liquid.getVolume() > liquid.getMaxVolume())
			System.err.printf("This cup can't contain more than %dml of liquid!%n", liquid.getMaxVolume());
		else
			this.liquid = liquid;
	}
}
