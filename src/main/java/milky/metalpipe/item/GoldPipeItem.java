package milky.metalpipe.item;

import milky.metalpipe.sound.ModSounds;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GoldPipeItem extends SwordItem {
    public GoldPipeItem(Settings settings)
    {
        super(ToolMaterials.GOLD, 2, 4f, settings);

    }
    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        stack.damage(1, attacker, (e) -> {
            e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        });
        target.getWorld().playSound(null, attacker.getBlockPos(), ModSounds.SOUND_GPIPE,
                SoundCategory.PLAYERS, 1.5f, Random.create().nextFloat()*0.2f+0.9f);
        return true;
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("tooltip.metal-pipe.metalpipe"));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
