package net.pugsworth.INSERT_MODID_HERE.Block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tools.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks
{

    
    public static void RegisterBlocks()
    {

    }

    public static void registerBlock(String id, Block block, ItemGroup group)
	{
		Registry.register(Registry.BLOCK, new Identifier(MODCLASS.MODID, id), block);
		Registry.register(Registry.ITEM, new Identifier(MODCLASS.MODID, id), new BlockItem(block, new Item.Settings().group(group)));
	}
}
