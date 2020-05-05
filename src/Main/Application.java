package Main;

import Kitchen.*;
import World.*;

public class Application {

	public static void main(String[] args) {

		Liquid water500 = new Liquid("water", 500, 36);
		Cup standardCup = new Cup(water500);
		water500.setVolume(water500.getVolume()+50);

		standardCup.printInfo();

		Liquid water650 = new Liquid("water", 500, 54);
		BigCup bigCup = new BigCup(water650);
		water650.setVolume(water650.getVolume()+150);


		bigCup.printInfo();
	}
}