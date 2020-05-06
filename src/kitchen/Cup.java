package kitchen;

import world.*;

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
	}
	
	
	/////////////////////////////////  OUTPUT  /////////////////////////////////
	public void printInfo(){
		liquid.printInfo();
	}
}