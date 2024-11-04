package ash.horticulturepotioneering.item;

import ash.horticulturepotioneering.HorticultureAndPotioneering;
import ash.horticulturepotioneering.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {


    // Brews
    /* Potion effects to add
    Haste
    Strength
    Speed
    Night Vision
    Regeneration
    Fire Resistance
    Water Breathing
    Invisibility

    Weaker instant health?
    */
    public static final Item HASTE_BREW = registerItem("haste_brew",
            new HasteBrewItem(new FabricItemSettings().maxCount(1)));
    public static final Item STRENGTH_BREW = registerItem("strength_brew",
            new StrengthBrewItem(new FabricItemSettings().maxCount(1)));
    public static final Item SPEED_BREW = registerItem("speed_brew",
            new SpeedBrewItem(new FabricItemSettings().maxCount(1)));
    public static final Item NIGHT_VISION_BREW = registerItem("night_vision_brew",
            new NightVisionBrewItem(new FabricItemSettings().maxCount(1)));
    public static final Item REGENERATION_BREW = registerItem("regeneration_brew",
            new RegenerationBrewItem(new FabricItemSettings().maxCount(1)));
    public static final Item FIRE_RESISTANCE_BREW = registerItem("fire_resistance_brew",
            new FireResistanceBrewItem(new FabricItemSettings().maxCount(1)));
    public static final Item WATER_BREATHING_BREW = registerItem("water_breathing_brew",
            new WaterBreathingBrewItem(new FabricItemSettings().maxCount(1)));
    public static final Item INVISIBILITY_BREW = registerItem("invisibility_brew",
            new InvisibilityBrewItem(new FabricItemSettings().maxCount(1)));

    // Methods

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier( HorticultureAndPotioneering.MOD_ID, name), item);
    }

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {

    }

    public static void registerModItems() {
        HorticultureAndPotioneering.LOGGER.info("Registering Mod Items for " + HorticultureAndPotioneering.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS ).register(ModItems::addItemsToIngredientItemGroup);
    }
}
