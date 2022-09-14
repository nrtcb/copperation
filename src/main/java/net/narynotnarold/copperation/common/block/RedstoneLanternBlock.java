package net.narynotnarold.copperation.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class RedstoneLanternBlock extends LanternBlock {
    public static final BooleanProperty HANGING = BlockStateProperties.HANGING;
    private static final VoxelShape AABB = Shapes.or(Block.box(4.0D, 0.0D, 4.0D, 12.0D, 11.0D, 12.0D));
    private static final VoxelShape HANGING_AABB = Shapes.or(Block.box(4.0D, 3.0D, 4.0D, 12.0D, 14.0D, 12.0D));


    public RedstoneLanternBlock(Properties p_153465_) {
        super(p_153465_);
    }

    public @NotNull VoxelShape getShape(BlockState p_153474_, @NotNull BlockGetter blockGetter, @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        return p_153474_.getValue(HANGING) ? HANGING_AABB : AABB;
    }
}
