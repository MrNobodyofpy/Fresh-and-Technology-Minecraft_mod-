
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.freshandtechnologymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.freshandtechnologymod.potion.InternalbleedMobEffect;
import net.mcreator.freshandtechnologymod.FreshAndTechnologyModMod;

public class FreshAndTechnologyModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, FreshAndTechnologyModMod.MODID);
	public static final RegistryObject<MobEffect> INTERNALBLEED = REGISTRY.register("internalbleed", () -> new InternalbleedMobEffect());
}
