package net.narynotnarold.copperation.common.item;

import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import javax.swing.*;
import java.awt.*;

public class FortuneTellerItem extends Item {
    public FortuneTellerItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND) {
            //output a random number
            outputRandomNumber(player);
            player.getCooldowns().addCooldown(this, 100);
        }
        return super.use(level, player, hand);
    }
    private void outputRandomNumber(Player player) {
        player.sendSystemMessage(Component.literal("Your lucky number is "+getRandomNumber()));
    }


    private int getRandomNumber(){

        return RandomSource.createNewThreadLocalInstance().nextInt(10);
    }
}
