package net.narynotnarold.copperation.common.registry;

import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropperBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.narynotnarold.copperation.Copperation;
import net.narynotnarold.copperation.common.block.BlockProperties;

import static net.narynotnarold.copperation.common.block.BlockProperties.*;

@Mod.EventBusSubscriber(modid = Copperation.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CBlocks {

    public static final BlockSubRegistryHelper HELPER = Copperation.REGISTRY_HELPER.getBlockSubHelper();

    //Misc Building Blocks
    public static final RegistryObject<Block> STEEL_BLOCK = HELPER.createBlock("steel_block", () -> new Block(BlockProperties.STEEL_BLOCK), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> VENT = HELPER.createBlock("vent", () -> new RotatedPillarBlock(BlockProperties.VENT), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //Copper Pipes
    public static final RegistryObject<Block> COPPER_PIPE = HELPER.createBlock("copper_pipe", () -> new RotatedPillarBlock(BlockProperties.COPPER_PIPE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EXPOSED_COPPER_PIPE = HELPER.createBlock("exposed_copper_pipe", () -> new RotatedPillarBlock(BlockProperties.EXPOSED_COPPER_PIPE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WEATHERED_COPPER_PIPE = HELPER.createBlock("weathered_copper_pipe", () -> new RotatedPillarBlock(BlockProperties.WEATHERED_COPPER_PIPE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> OXIDIZED_COPPER_PIPE = HELPER.createBlock("oxidized_copper_pipe", () -> new RotatedPillarBlock(BlockProperties.OXIDIZED_COPPER_PIPE), CreativeModeTab.TAB_BUILDING_BLOCKS);
    //Copper Bricks
    public static final RegistryObject<Block> COPPER_BRICKS = HELPER.createBlock("copper_bricks", () -> new Block(BlockProperties.COPPER_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> EXPOSED_COPPER_BRICKS = HELPER.createBlock("exposed_copper_bricks", () -> new Block(BlockProperties.EXPOSED_COPPER_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> WEATHERED_COPPER_BRICKS = HELPER.createBlock("weathered_copper_bricks", () -> new Block(BlockProperties.WEATHERED_COPPER_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final RegistryObject<Block> OXIDIZED_COPPER_BRICKS = HELPER.createBlock("oxidized_copper_bricks", () -> new Block(BlockProperties.OXIDIZED_COPPER_BRICKS), CreativeModeTab.TAB_BUILDING_BLOCKS);

    //Redstone Blocks
    public static final RegistryObject<Block> COPPER_LEVER = HELPER.createBlock("copper_lever", () -> new RotatedPillarBlock(BlockProperties.COPPER_LEVER), CreativeModeTab.TAB_REDSTONE);
    public static final RegistryObject<Block> COPPER_PRESSURE_PLATE = HELPER.createBlock("copper_pressure_plate", () -> new PressurePlateBlock(BlockProperties.COPPER_PRESSURE_PLATE), CreativeModeTab.TAB_REDSTONE);

    //Dropper Blocks
    public static final RegistryObject<Block> COPPER_DROPPER = HELPER.createBlock("copper_dropper", () -> new DropperBlock(BlockProperties.COPPER_DROPPER), CreativeModeTab.TAB_REDSTONE);


}
