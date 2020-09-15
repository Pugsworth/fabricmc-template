package net.pugsworth.INSERT_MODID_HERE;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import me.sargunvohra.mcmods.autoconfig1u.AutoConfig;
import me.sargunvohra.mcmods.autoconfig1u.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.pugsworth.INSERT_MODID_HERE.Block.ModBlocks;
import net.pugsworth.INSERT_MODID_HERE.Config.MODCLASSConfig;

public class MODCLASSMod implements ModInitializer
{
	public static final String MODID = "INSERT_MODID_HERE";
	public static final Logger logger = LogManager.getLogger(MODID);
	public static final MODCLASSConfig CONFIG = AutoConfig.register(MODCLASSConfig.class, JanksonConfigSerializer::new).getConfig();

	@Override
	public void onInitialize()
	{
		if (!CONFIG.enable)
			return;

		ModBlocks.RegisterBlocks();
	}
}
