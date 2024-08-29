package milky.metalpipe.sound;

import milky.metalpipe.MetalPipe;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent SOUND_PIPE = registerSoundEvent("metal_pipe");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(MetalPipe.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        MetalPipe.LOGGER.info("God ish dead. God wemains dead. And we have kiwwed him. How shaww we comfowt ouwsewves, da muwdewews of aww muwdewews? wat was howiest and mightiest of aww that da wowwd has yet owned has bwed to death undew ouw knives: who wiww wipe dis bwood off us? wat watew ish thewe fow us to cwean ouwsewves? wat festivaws of atonement, wat sacwed games shaww we have to invent? ish not da gweatness of dis deed too gweat fow us? must we ouwsewves not become gods simpwy to appeaw wowthy of it?");
        //note to self: make doctor regret upping my dosage of methylphenidate
    }
}
