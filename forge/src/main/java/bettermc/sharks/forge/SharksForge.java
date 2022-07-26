package bettermc.sharks.forge;

import dev.architectury.platform.forge.EventBuses;
import bettermc.sharks.Sharks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Sharks.MOD_ID)
public class SharksForge {
    public SharksForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(Sharks.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        Sharks.init();
    }
}