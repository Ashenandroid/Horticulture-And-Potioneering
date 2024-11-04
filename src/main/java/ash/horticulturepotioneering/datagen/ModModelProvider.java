package ash.horticulturepotioneering.datagen;

import ash.horticulturepotioneering.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        // Brews
        itemModelGenerator.register(ModItems.FIRE_RESISTANCE_BREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.HASTE_BREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.INVISIBILITY_BREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.NIGHT_VISION_BREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.REGENERATION_BREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPEED_BREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.STRENGTH_BREW, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_BREATHING_BREW, Models.GENERATED);
    }
}
