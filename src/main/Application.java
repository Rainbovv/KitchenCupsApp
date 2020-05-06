package main;

import kitchen.*;
import world.*;
import tools.*;

public class Application {

	public static void main(String[] args) {

		DangerousLiquid disinfectant = new DangerousLiquid("disinfectant","toxic", 150, 36);
		SmallCup smallCup = new SmallCup(disinfectant);
		disinfectant.setVolume(disinfectant.getVolume()+50);

		smallCup.printInfo();
		System.out.println(LiquidTester.isDrinkable(smallCup));

		DrinkableLiquid water650 = new DrinkableLiquid("water", "cold drink", 650, 54);
		BigCup bigCup = new BigCup(water650);
		water650.setVolume(water650.getVolume()+150);

		bigCup.printInfo();
		System.out.println(LiquidTester.isDrinkable(bigCup));


	}
}