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
            new Identifier(HorticultureAndPotioneering.MOD_ID, "hncbrews"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(Items.EXPERIENCE_BOTTLE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.HASTE_BREW);

                    }).build());

    public static void registerItemGroups() {
        HorticultureAndPotioneering.LOGGER.info("Registering Item Groups For " + HorticultureAndPotioneering.MOD_ID);
    }
}
