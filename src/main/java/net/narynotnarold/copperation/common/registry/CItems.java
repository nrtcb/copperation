package net.narynotnarold.copperation.common.registry;

import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.narynotnarold.copperation.Copperation;
import net.narynotnarold.copperation.common.item.FortuneTellerItem;

@Mod.EventBusSubscriber(modid = Copperation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CItems {
    public static final ItemSubRegistryHelper HELPER = Copperation.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> SILICON = HELPER.createItem("silicon", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> STEEL_INGOT = HELPER.createItem("steel_ingot", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
    public static final RegistryObject<Item> FORTUNE_TELLER = HELPER.createItem("fortune_teller", () -> new FortuneTellerItem(new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).durability(10).rarity(Rarity.EPIC)));
}
