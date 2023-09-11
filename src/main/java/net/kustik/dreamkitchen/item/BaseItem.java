package net.kustik.dreamkitchen.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.kustik.dreamkitchen.DreamKitchen;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class BaseItem {

    private BaseItem(){};

    public static Item register(String name){
        return Registry.register(Registries.ITEM, new Identifier(DreamKitchen.MOD_ID, name),
                new Item(new FabricItemSettings()));
    }
}
