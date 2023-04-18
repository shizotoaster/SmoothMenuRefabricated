package net.shizotoaster.smoothmenu.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class SmoothMenuMixin {
    @Inject(at=@At("HEAD"), method="getFramerateLimit()I", cancellable=true)
    private void getFramerateLimit(CallbackInfoReturnable<Integer> ci) {
        ci.setReturnValue(((MinecraftClient)(Object)this).getWindow().getFramerateLimit());
    }
}
