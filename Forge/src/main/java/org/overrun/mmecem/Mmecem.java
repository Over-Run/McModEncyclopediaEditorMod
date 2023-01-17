package org.overrun.mmecem;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.overrun.Main;
import org.slf4j.Logger;

@Mod(Mmecem.MODID)
public class Mmecem {
    public static final String MODID = "mmecem";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Mmecem() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
