package com.github.geysercustommodeldata.templategeyserextension.custom;

import org.geysermc.geyser.api.custommodeldata.CustomItemData;

public class MagicStick extends CustomItemData {
    public MagicStick() {
        super(502698, "magic_stick");

        this.setIsTool(true);
        this.setTextureSize(32);
    }
}
