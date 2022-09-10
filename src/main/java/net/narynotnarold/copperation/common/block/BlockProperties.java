package net.narynotnarold.copperation.common.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class BlockProperties {
    //Misc building blocks
    public static final BlockBehaviour.Properties STEEL_BLOCK = BlockBehaviour.Properties.of(Material.HEAVY_METAL, MaterialColor.COLOR_GRAY).strength(6F).sound(SoundType.NETHERITE_BLOCK);
    public static final BlockBehaviour.Properties COPPER_DROPPER = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(2F).sound(SoundType.COPPER);
    public static final BlockBehaviour.Properties VENT = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(6F).sound(SoundType.COPPER);
    //Copper Pipe stuff!!!!!
    public static final BlockBehaviour.Properties COPPER_PIPE = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(6F).sound(SoundType.COPPER);
    public static final BlockBehaviour.Properties EXPOSED_COPPER_PIPE = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(6F).sound(SoundType.COPPER);
    public static final BlockBehaviour.Properties WEATHERED_COPPER_PIPE = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).strength(6F).sound(SoundType.COPPER);
    public static final BlockBehaviour.Properties OXIDIZED_COPPER_PIPE = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GREEN).strength(6F).sound(SoundType.COPPER);
    //Copper bricks i think
    public static final BlockBehaviour.Properties COPPER_BRICKS = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.COPPER);
    public static final BlockBehaviour.Properties EXPOSED_COPPER_BRICKS = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(3.0F, 6.0F).sound(SoundType.COPPER);
    public static final BlockBehaviour.Properties WEATHERED_COPPER_BRICKS = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_LIGHT_GREEN).strength(3.0F, 6.0F).sound(SoundType.COPPER);
    public static final BlockBehaviour.Properties OXIDIZED_COPPER_BRICKS = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GREEN).strength(3.0F, 6.0F).sound(SoundType.COPPER);


    //Redstone Blocks
    public static final BlockBehaviour.Properties COPPER_LEVER = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(6F).sound(SoundType.COPPER).instabreak().noCollission().dynamicShape();
    public static final BlockBehaviour.Properties COPPER_PRESSURE_PLATE = BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_ORANGE).strength(6F).sound(SoundType.COPPER).noOcclusion();

}
