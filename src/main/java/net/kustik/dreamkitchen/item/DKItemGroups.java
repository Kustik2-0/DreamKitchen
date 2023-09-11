package net.kustik.dreamkitchen.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kustik.dreamkitchen.DreamKitchen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class DKItemGroups {

    public static final ItemGroup DK = BaseItemGroup.register("DreamKitchen", DKItems.MINT);

    public static void addToGroups(Item item, ItemGroup... groups) {
        for (ItemGroup group : groups) {
            ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        }
    }
    
    public static void register(){
        DreamKitchen.LOGGER.info("Registering creative tab for " + DreamKitchen.MOD_ID);
    }
}