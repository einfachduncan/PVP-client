package de.einfachduncan.pvpclient;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PVPClientMod implements ModInitializer {
    public static final String MOD_ID = "pvp-client";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("PVP Client initialized!");
    }
}