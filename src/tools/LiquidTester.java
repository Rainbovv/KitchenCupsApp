package tools;

import kitchen.*;
import world.*;

public class LiquidTester {

    public static boolean isDrinkable (Cup cup){
        return cup.getLiquid() instanceof DrinkableLiquid;
    }
}