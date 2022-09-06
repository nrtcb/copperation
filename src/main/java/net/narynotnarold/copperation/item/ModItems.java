package net.narynotnarold.copperation.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.narynotnarold.copperation.Copperation;
import net.narynotnarold.copperation.item.custom.FortuneTellerItem;

public class ModItems {
    
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Copperation.MOD_ID);

        public static final RegistryObject<Item>  SILICON = ITEMS.register("silicon",
                () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item>  STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item>  FORTUNE_TELLER = ITEMS.register("fortune_teller",
            () -> new FortuneTellerItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)
                    .durability(10)
                    .rarity(Rarity.EPIC)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
