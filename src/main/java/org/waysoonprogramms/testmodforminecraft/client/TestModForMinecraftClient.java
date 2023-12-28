package org.waysoonprogramms.testmodforminecraft.client;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestModForMinecraftClient implements ModInitializer {
    public static final String MOD_ID = "testMod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.debug("Init");
    }
}
