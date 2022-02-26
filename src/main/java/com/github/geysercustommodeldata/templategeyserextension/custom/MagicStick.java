package com.github.geysercustommodeldata.templategeyserextension.custom;

import org.geysermc.geyser.api.custom.items.CustomItemData;
import org.geysermc.geyser.api.custom.items.registration.CustomModelDataItemType;

public class MagicStick extends CustomItemData {
    public MagicStick() {
        super(new CustomModelDataItemType(502698), "magic_stick");

        this.setIsTool(true);
        this.setTextureSize(32);
    }
}
