package ash.horticulturepotioneering.item;

import ash.horticulturepotioneering.HorticultureAndPotioneering;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup HnP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(HorticultureAndPotioneering.MOD_ID, "hnp"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.hnp"))
                    .icon(() -> new ItemStack(Items.EXPERIENCE_BOTTLE)).entries((displayContext, entries) -> {

                        // Crops
                        entries.add(ModItems.CHILLBERRIES);
                        entries.add(ModItems.SPINACH);
                        entries.add(ModItems.LEMON);
                        entries.add(ModItems.LIME);
                        entries.add(ModItems.ORANGE);
                        entries.add(ModItems.WILLOW_BARK);

                        // Brews
                        entries.add(ModItems.HASTE_BREW);
                        entries.add(ModItems.STRENGTH_BREW);
                        entries.add(ModItems.SPEED_BREW);
                        entries.add(ModItems.FIRE_RESISTANCE_BREW);
                        entries.add(ModItems.INVISIBILITY_BREW);
                        entries.add(ModItems.NIGHT_VISION_BREW);
                        entries.add(ModItems.REGENERATION_BREW);
                        entries.add(ModItems.WATER_BREATHING_BREW);

                    }).build());

    public static void registerItemGroups() {
        HorticultureAndPotioneering.LOGGER.info("Registering Item Groups For " + HorticultureAndPotioneering.MOD_ID);
    }
}
