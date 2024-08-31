package milky.metalpipe.item;

import milky.metalpipe.MetalPipe;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PIPE = registerItem("metalpipe", new MetalPipeItem(new FabricItemSettings()
            .maxCount(1).maxDamage(300)));
    public static final Item GPIPE = registerItem("goldpipe", new GoldPipeItem(new FabricItemSettings()
            .maxCount(1).maxDamage(400)));
    public static final Item CPIPE = registerItem("copperpipe", new CopperPipeItem(new FabricItemSettings()
            .maxCount(1).maxDamage(500)));
    public static final Item NPIPE = registerItem("netherpipe", new NetheritePipeItem(new FabricItemSettings()
            .maxCount(1).maxDamage(600)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MetalPipe.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MetalPipe.LOGGER.info("Metalling on my Pipe, and by pipe, lets just say my metal pipe"); //God this is so stupid. I hope someone reads this comment and kills me point blank.
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(content -> {
            content.add(PIPE);
            content.add(GPIPE);
            content.add(CPIPE);
            content.add(NPIPE);
        });
    }
}
