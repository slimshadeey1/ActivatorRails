package org.poweredrails;

import org.poweredrails.api.Archive;
import org.poweredrails.api.Command.Command;
import org.poweredrails.api.Server;
import org.poweredrails.api.world.WorldManager;
import org.poweredrails.api.world.condition.Condition;

public class RailsServer implements Server {

    private WorldManager worldManager;

    public RailsServer() {

    }

    @Override public WorldManager getWorldManager() {
        return worldManager;
    }

    @Override public Condition getConditions() {
        // TODO: Auto-generated method stub
        return null;
    }

    @Override public Archive getArchive() {
        return null;
    }

    @Override public Command registerCommand() {
        return null;
    }
}
