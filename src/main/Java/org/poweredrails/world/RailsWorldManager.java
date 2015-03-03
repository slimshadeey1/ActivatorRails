package org.poweredrails.world;

import com.google.common.base.Optional;
import org.poweredrails.api.world.World;
import org.poweredrails.api.world.WorldManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class RailsWorldManager implements WorldManager {

    private List<World> worlds;

    public RailsWorldManager(World... worlds) {
        if (worlds.length > 0) {
            this.worlds = Arrays.asList(worlds);
        }
    }

    @Override public List<World> getWorlds() {
        return worlds;
    }

    @Override public Optional<World> getWorld(String name) {
        for (World w : worlds) {
            if (w.getName().equals(name)) {
                return Optional.of(w);
            }
        }
        return Optional.of(null);
    }

    @Override public Optional<World> getWorld(UUID u) {
        for (World w : worlds) {
            if (w.getUniqueId().equals(u)) {
                return Optional.of(w);
            }
        }
        return Optional.of(null);
    }

    @Override public void addWorld(World w) {
        worlds.add(w);
    }
}
