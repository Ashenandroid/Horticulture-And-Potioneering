package ash.horticulturepotioneering.item;

import ash.horticulturepotioneering.HorticultureAndPotioneering;
import ash.horticulturepotioneering.item.custom.HasteBrewItem;
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
    public static final Item HASTE_BREW = registerItem("haste_brew",
            new HasteBrewItem(new FabricItemSettings()));

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
