package net.lomeli.ec.entity;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;

import net.lomeli.ec.lib.ModVars;

public class EntityLightCreeper extends EntityBaseCreeper {

    public EntityLightCreeper(World par1World) {
        super(par1World);
    }

    @Override
    public void explosion(int power, boolean flag) {
        int radius = getPowered() ? (ModVars.lightCreeperRadius * power) : ModVars.lightCreeperRadius;
        if (ModVars.domeExplosion)
            this.domeExplosion(radius, Blocks.glowstone);
        else
            this.wildExplosion(radius, Blocks.glowstone);
    }
}
