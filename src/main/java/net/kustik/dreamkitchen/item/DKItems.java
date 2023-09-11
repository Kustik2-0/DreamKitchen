package net.kustik.dreamkitchen.item;

import net.kustik.dreamkitchen.DreamKitchen;
import net.minecraft.item.Item;

public class DKItems {

    public static final Item MINT = BaseItem.register("mint");

    private static void addItemsToGroups(){
        DKItemGroups.addToGroups(MINT,
                DKItemGroups.DK);
    }

    public static void register(){
        addItemsToGroups();
        DreamKitchen.LOGGER.info("Registering items for " + DreamKitchen.MOD_ID);
    }
}