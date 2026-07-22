package com.lazymc.nodeathxpdrop.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Always 0, regardless of the keepInventory gamerule - stops players from suiciding to farm XP
 * orbs off their own corpse (relevant now that Total Levels Tracker counts every orb pickup
 * toward a lifetime total that's never supposed to go down).
 */
@Mixin(PlayerEntity.class)
public abstract class NoDeathXpDropMixin {
    @Inject(method = "getExperienceToDrop", at = @At("RETURN"), cancellable = true)
    private void nodeathxpdrop$neverDropXp(ServerWorld world, CallbackInfoReturnable<Integer> cir) {
        cir.setReturnValue(0);
    }
}
