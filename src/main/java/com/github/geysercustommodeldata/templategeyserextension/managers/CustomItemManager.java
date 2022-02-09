package com.github.geysercustommodeldata.templategeyserextension.managers;

import com.github.geysercustommodeldata.templategeyserextension.custom.MagicStick;
import org.geysermc.geyser.api.custommodeldata.CustomItemData;
import org.geysermc.geyser.api.custommodeldata.CustomModelDataManager;

public class CustomItemManager {
    private final CustomModelDataManager customModelDataManager;

    public CustomItemManager(CustomModelDataManager customModelDataManager) {
        this.customModelDataManager = customModelDataManager;
    }

    public void init() {
        this.registerCustomItem("minecraft:stick", new MagicStick());
    }

    public void registerCustomItem(String baseItem, CustomItemData customItem) {
        this.customModelDataManager.registerCustomItem(baseItem, customItem);
    }
}
