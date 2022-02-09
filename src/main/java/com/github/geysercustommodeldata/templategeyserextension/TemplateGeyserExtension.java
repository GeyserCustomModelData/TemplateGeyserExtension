package com.github.geysercustommodeldata.templategeyserextension;

import com.github.geysercustommodeldata.templategeyserextension.managers.CustomItemManager;
import org.geysermc.geyser.api.custommodeldata.CustomModelDataManager;
import org.geysermc.geyser.api.event.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserPreInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;

public class TemplateGeyserExtension implements Extension {
    @Subscribe
    public void onPostInitialize(GeyserPreInitializeEvent event) {
        CustomModelDataManager itemsManager = this.geyserApi().customModelDataManager();
        CustomItemManager customItemManager = new CustomItemManager(itemsManager);

        this.logger().info("Adding custom items...");
        customItemManager.init();
    }
}
