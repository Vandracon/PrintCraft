package net.vandracon.printcraft.core.registry.tags;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import net.vandracon.printcraft.PrintCraft;
import net.vandracon.printcraft.Reference;

public class ModBlockTags {
    public static final class Blocks {
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_PRINTER = forge("storage_blocks/printer");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(Reference.MOD_ID, path).toString());
        }
    }
}
