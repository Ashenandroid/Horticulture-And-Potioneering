package ash.horticulturepotioneering.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {

/*Food Component/Recipe Ideas
* Chillberries - fire resistance
* Spinach - Strength
* Lemon / Orange / Lime - Night vision, Lemon and lime cause 1/2 heart of damage
* Willow Bark - Regeneration
* Green tea - speed
* */

    public static final FoodComponent CHILLBERRIES = new FoodComponent.Builder().hunger(2).saturationModifier(0.1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE,200), 0.25f).build();

    public static final FoodComponent SPINACH = new FoodComponent.Builder().hunger(4).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 200), 0.25f).build();

    public static final FoodComponent LEMON = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 0.10f).build();

    public static final FoodComponent LIME = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 0.10f).build();

    public static final FoodComponent ORANGE = new FoodComponent.Builder().hunger(2).saturationModifier(0.2f).build();

    public static final FoodComponent WILLOW_BARK = new FoodComponent.Builder().hunger(0).saturationModifier(0.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100), 0.25f)
            .snack().alwaysEdible().build();

}
