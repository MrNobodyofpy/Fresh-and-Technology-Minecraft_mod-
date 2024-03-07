package net.mcreator.freshandtechnologymod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.freshandtechnologymod.FreshAndTechnologyModMod;

public class Internal_bleed_effect_1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double Number = 0;
		for (int index0 = 0; index0 < 5; index0++) {
			FreshAndTechnologyModMod.queueServerWork(20, () -> {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 4));
			});
		}
	}
}
