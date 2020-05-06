package world;

public class DrinkableLiquid extends Liquid{

    private String category;


    public DrinkableLiquid(String name, String category, int volume, int temperature) {
        super(name, volume, temperature);
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void printInfo(){
        System.out.printf("This cup contains %dml of %s %s at %d\u2103!%n",
                           getVolume(),getCategory(), getName(), getTemperature());
    }
}