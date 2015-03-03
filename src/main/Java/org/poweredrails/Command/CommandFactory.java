package org.poweredrails.Command;


import org.poweredrails.api.Command.Command;

/**
 * Created by benbyers on 3/3/15.
 */
public class CommandFactory {

    CommandMap map;

    public CommandFactory() {
        map = new CommandMap();
    }

    public void registerCommand(Command command) {
        map.addCommand(command);
    }

}