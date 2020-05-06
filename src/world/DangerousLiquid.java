package world;

public class DangerousLiquid extends Liquid {

    private String level;


    public DangerousLiquid(String name, String level, int volume, int temperature) {
        super(name, volume, temperature);
        this.level = level;
    }


    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void printInfo(){
        System.out.printf("This cup contains %dml of %s %s!%n",
                           getVolume(),getLevel(), getName());
    }
}