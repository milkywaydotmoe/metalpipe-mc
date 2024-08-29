package milky.metalpipe.item;

import milky.metalpipe.sound.ModSounds;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.random.Random;

public class MetalPipeItem extends SwordItem {
    public MetalPipeItem (Item.Settings settings)
    {
        super(ToolMaterials.IRON, 4, 2.6f, settings);

    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, (e) -> {
            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        });
        target.getWorld().playSound(null, attacker.getBlockPos(), ModSounds.SOUND_PIPE,
                SoundCategory.PLAYERS, 1f, Random.create().nextFloat()*0.2f+0.9f);
        return true;
    }

}
