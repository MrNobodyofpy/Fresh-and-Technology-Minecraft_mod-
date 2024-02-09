package net.mcreator.freshandtechnologymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.freshandtechnologymod.FreshAndTechnologyModMod;

public class Internal_bleed_effect_1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		FreshAndTechnologyModMod.queueServerWork(60, () -> {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(-4);
		});
	}
}
