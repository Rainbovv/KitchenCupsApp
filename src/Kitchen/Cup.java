package Kitchen;

import World.*;

public class Cup {
	
	// PROPERTIES
    	private final int MAX_VOLUME = 600;
		protected Liquid liquid;

    
    ///////////////////////////////  CONSTRUCTOR  ///////////////////////////////   
	public Cup() {}

	public Cup(Liquid liquid){
		setLiquid(liquid);
	}

    
    /////////////////////////////////  GETTERS  /////////////////////////////////
	public Liquid getLiquid() {
		return liquid;
	}

	
	/////////////////////////////////  SETTERS  /////////////////////////////////
	public void setLiquid(Liquid liquid) {
		if (liquid.getVolume() > MAX_VOLUME)
			System.err.printf("This cup can't contain more than %dml of liquid!%n", MAX_VOLUME);
		else
			this.liquid = liquid;
			liquid.setMaxVolume(MAX_VOLUME);
	}
	
	
	/////////////////////////////////  OUTPUT  /////////////////////////////////
	public void printInfo(){
		System.out.printf("This cup contains %d ml of %s at %d\u2103%n",
				   liquid.getVolume(), liquid.getName(), liquid.getTemperature());
	}
}
