package net.narynotnarold.copperation.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.DropperBlock;
import net.minecraft.world.level.block.WeatheringCopper;
import net.minecraft.world.level.block.state.BlockState;

public abstract class WeatheringDropperBlock extends DropperBlock implements WeatheringCopper {
    private WeatherState weatherState;

    public WeatheringDropperBlock(Properties properties) {
        super(properties);
    }
    public void randomTick(BlockState pState, ServerLevel pLevel, BlockPos pPos, RandomSource pRandom) {
        this.onRandomTick(pState, pLevel, pPos, pRandom);
    }

    public boolean isRandomlyTicking(BlockState pState) {
        return WeatheringCopper.getNext(pState.getBlock()).isPresent();
    }

    public WeatheringCopper.WeatherState getAge() {
        return this.weatherState;
    }
}
