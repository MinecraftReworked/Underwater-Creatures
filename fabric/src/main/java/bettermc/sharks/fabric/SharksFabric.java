package bettermc.sharks.fabric;

import bettermc.sharks.Sharks;
import net.fabricmc.api.ModInitializer;

public class SharksFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Sharks.init();
    }
}