package net.narynotnarold.copperation;


import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Copperation.MOD_ID)
public class Copperation {
    public static final String MOD_ID = "copperation";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);
    public Copperation() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        REGISTRY_HELPER.register(bus);


        bus.addListener(this::rendererSetup);

    }
    private void rendererSetup(EntityRenderersEvent.RegisterRenderers event) {}
}
