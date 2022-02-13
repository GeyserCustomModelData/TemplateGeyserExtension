package com.github.geysercustommodeldata.templategeyserextension.managers;

import com.github.geysercustommodeldata.templategeyserextension.custom.MagicStick;
import org.geysermc.geyser.api.custom.CustomManager;
import org.geysermc.geyser.api.custom.items.CustomItemData;
import org.geysermc.geyser.api.custom.items.CustomItemManager;

public class ItemManager {
    private final CustomItemManager customItemManager;

    public ItemManager(CustomManager customManager) {
        this.customItemManager = customManager.getItemManager();
    }

    public void init() {
        this.registerCustomItem("minecraft:stick", new MagicStick());
    }

    public void registerCustomItem(String baseItem, CustomItemData customItem) {
        this.customItemManager.registerCustomItem(baseItem, customItem);
    }
}
