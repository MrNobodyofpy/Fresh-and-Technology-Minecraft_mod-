
package net.mcreator.freshandtechnologymod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.freshandtechnologymod.procedures.Internal_bleed_effect_1Procedure;

public class InternalbleedMobEffect extends MobEffect {
	public InternalbleedMobEffect() {
		super(MobEffectCategory.HARMFUL, -65536);
	}

	@Override
	public String getDescriptionId() {
		return "effect.fresh_and_technology_mod.internalbleed";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Internal_bleed_effect_1Procedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
