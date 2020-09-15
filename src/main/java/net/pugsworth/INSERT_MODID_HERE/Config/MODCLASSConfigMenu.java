package net.pugsworth.INSERT_MODID_HERE.config;

import java.util.function.Function;

import io.github.prospector.modmenu.api.ModMenuApi;
import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.pugsworth.INSERT_MODID_HERE.MODCLASSMod;

@Environment(EnvType.CLIENT)
public class MODCLASSConfigMenu implements ModMenuApi
{

    @Override
    public String getModId() {
        return MODCLASS.MODID;
    }

    @Override
    public Function<Screen, ? extends Screen> getConfigScreenFactory() {
        return parent -> AutoConfig.getConfigScreen(MODCLASSConfig.class, parent).get();
    }
    
}
