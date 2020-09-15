package net.pugsworth.INSERT_MODID_HERE.config;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.pugsworth.INSERT_MODID_HERE.MODCLASSMod;

@Config(name=MODCLASS.MODID)
public class MODCLASSConfig implements ConfigData
{
    @Comment("Enable the mod's functionality.")
    public boolean enable = true;
    @Comment("What's your favourite number?")
    public int maximumDistance = 3;

    @ConfigEntry.Gui.CollapsibleObject
    public NestedExample nestedExample = new NestedExample();

    public static class NestedExample
    {
        @Comment("Shows how a nested config option works.")
        public boolean nestedaction = true;
    }

}
