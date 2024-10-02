package com.example.rm1;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;

public class ModItems {

    // Create a new Item instance
    public static final Item EXAMPLE_ITEM = new Item(new FabricItemSettings().maxCount(64));

    public static void registerItems() {
        // Register the item with the game registry
        Registry.register(Registry.ITEM, new Identifier("yourmodid", "example_item"), EXAMPLE_ITEM);
    }
}
