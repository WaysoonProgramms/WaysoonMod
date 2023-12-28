package org.waysoonprogramms.testmodforminecraft.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.waysoonprogramms.testmodforminecraft.TestModForMinecraft;

public class ItemsGroups {

    public static final ItemGroup WAYSOON_MOD = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TestModForMinecraft.MOD_ID, "waysoon_mod"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.waysoon_mod"))
                    .icon(() -> new ItemStack(Items.WAYSOON)).entries((displayContext, entries) -> {
                        entries.add(Items.RUBY);
                    }).build());

    public static void register() {
        TestModForMinecraft.LOGGER.debug("Register mod item groups");
    }

}
