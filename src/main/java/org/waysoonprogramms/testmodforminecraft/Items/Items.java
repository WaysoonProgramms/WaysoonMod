package org.waysoonprogramms.testmodforminecraft.Items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.waysoonprogramms.testmodforminecraft.TestModForMinecraft;

public class Items {
    public static final Item RUBY = registryItem("ruby", new Item(new FabricItemSettings()));
    public static final Item WAYSOON = registryItem("waysoon", new Item(new FabricItemSettings()));

    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
    }

    private static Item registryItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TestModForMinecraft.MOD_ID, name), item);
    }

    public static void register() {
        TestModForMinecraft.LOGGER.debug("Registering mod items");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Items::addItemsToIngredientTabItemGroup);
    }
}
