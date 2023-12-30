package org.waysoonprogramms.testmodforminecraft;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.waysoonprogramms.testmodforminecraft.Blocks.Blocks;
import org.waysoonprogramms.testmodforminecraft.Items.Items;
import org.waysoonprogramms.testmodforminecraft.Items.ItemsGroups;

public class TestModForMinecraft implements ModInitializer {
    public static final String MOD_ID = "waysoonmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ItemsGroups.register();

        Items.register();
        Blocks.register();
    }
}
