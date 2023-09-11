package net.kustik.dreamkitchen;

import net.fabricmc.api.ModInitializer;
import net.kustik.dreamkitchen.item.BaseItemGroup;
import net.kustik.dreamkitchen.item.DKItemGroups;
import net.kustik.dreamkitchen.item.DKItems;
import net.kustik.dreamkitchen.item.TestItemGroup;

import java.util.logging.Logger;

public class DreamKitchen implements ModInitializer {

    public static final String MOD_ID = "dreamkitchen";
    public static final Logger LOGGER = Logger.getLogger(MOD_ID);

    @Override
    public void onInitialize(){
        //DKItems.register();
        //DKItemGroups.register();
        //BaseItemGroup.register();
        TestItemGroup.register();
    }
}
