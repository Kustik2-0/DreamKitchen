package net.kustik.dreamkitchen.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.kustik.dreamkitchen.DreamKitchen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class TestItemGroup {
    public static ItemGroup kaksozdat(String name, Item icon){
        return FabricItemGroup.builder(new Identifier(DreamKitchen.MOD_ID, name))
                .displayName(Text.translatable("itemgroup." + name))
                .icon(() -> new ItemStack(icon))
                .build();
    }

    //public static final ItemGroup DK = kaksozdat("DreamKitchen", DKItems.MINT);

    public static void register(){
        DreamKitchen.LOGGER.info("End");
    }
}
