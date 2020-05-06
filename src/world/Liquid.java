package world;

public class Liquid {

    // Properties
    private int maxVolume;
    private String name;
    private int volume;
    private int temperature;


    ///////////////////////////  CONSTRUCTOR  ///////////////////////////
    public Liquid(){}

    public Liquid(String name, int volume, int temperature){
        setName(name);
        setVolume(volume);
        setTemperature(temperature);
    }


    ///////////////////////////  SETTERS  ///////////////////////////
    public void setName(String name) {
        if (name.equals(""))
            System.err.println("Please enter a name for the liquid!");
        else
            this.name = name;
    }

    public void setVolume(int volume) {
        if (volume <= 0)
            System.err.println("The volume should be more than \"0\"");
        if (maxVolume != 0 && volume > maxVolume)
            System.err.printf("This cup can't contain more than %dml of liquid!%n", getMaxVolume());
        else
            this.volume = volume;
    }

    public void setTemperature(int temperature) {
        if(temperature < 0 || temperature > 100)
            System.err.println("The temperature should be in the grade: 0 - 100");
        else
            this.temperature = temperature;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    
    ///////////////////////////  GETTERS  ///////////////////////////
    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    // Liquid temperature checking methods.
    public boolean isCold(){
        return (temperature <= 18);
    }

    public boolean isWarm(){
        return (temperature > 18 && temperature <= 36);
    }

    public boolean isHot(){
        return (temperature > 36);
    }

    /////////////////////////////////  OUTPUT  /////////////////////////////////
    public void printInfo(){
        System.out.printf("This cup contains %d ml of %s at %d\u2103%n",
                           getVolume(), getName(), getTemperature());
    }
}
