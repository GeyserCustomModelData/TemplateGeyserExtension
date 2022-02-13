package com.github.geysercustommodeldata.templategeyserextension;

import com.github.geysercustommodeldata.templategeyserextension.managers.ItemManager;
import org.geysermc.geyser.api.custom.CustomManager;
import org.geysermc.geyser.api.event.Subscribe;
import org.geysermc.geyser.api.event.lifecycle.GeyserPreInitializeEvent;
import org.geysermc.geyser.api.extension.Extension;

public class TemplateGeyserExtension implements Extension {
    @Subscribe
    public void onPostInitialize(GeyserPreInitializeEvent event) {
        CustomManager customManager = this.geyserApi().customManager();

        ItemManager itemManager = new ItemManager(customManager);

        this.logger().info("Adding custom items...");
        itemManager.init();
    }
}
