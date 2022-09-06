package net.narynotnarold.copperation.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.narynotnarold.copperation.Copperation;
import net.narynotnarold.copperation.item.ModItems;

import javax.naming.Name;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Copperation.MOD_ID);

    public static final RegistryObject<Block> STEEL_BLOCK = registerBlock(  "steel_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.NETHERITE_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);


    public static final RegistryObject<Block> VENT = registerBlock(  "vent",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f).requiresCorrectToolForDrops()
                    .sound(SoundType.COPPER)), CreativeModeTab.TAB_BUILDING_BLOCKS);

    public static final RegistryObject<Block> COPPER_LEVER = registerBlock(  "copper_lever",
            () -> new LeverBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(6f)
                    .instabreak()
                    .noCollission()
                    .dynamicShape()
                    .sound(SoundType.COPPER)), CreativeModeTab.TAB_REDSTONE);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}