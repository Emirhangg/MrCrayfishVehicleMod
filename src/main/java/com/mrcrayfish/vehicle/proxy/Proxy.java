package com.mrcrayfish.vehicle.proxy;

import com.mrcrayfish.vehicle.entity.EntityVehicle;
import net.minecraft.entity.player.EntityPlayer;

/**
 * Author: MrCrayfish
 */
public interface Proxy
{
    void preInit();

    void playVehicleSound(EntityPlayer player, EntityVehicle vehicle);
}
