package org.poweredrails.Command;

import org.poweredrails.api.Command.Command;

import java.util.HashMap;

/**
 * Created by benbyers on 3/3/15.
 */
public class CommandMap {
    private HashMap<String,Command> commandMap =
        new HashMap<String, Command>();

    public void addCommand(Command command) {
        if(!commandMap.containsKey(command.getCommand())) {
            commandMap.put(command.getCommand(),command);
        }

        for(String alias : command.getAlias()) {
            if(!commandMap.containsKey(alias)) {
                commandMap.put(alias, command);
            }
        }

    }

    public Command getCommand (String command) {
        if (commandMap.containsKey(command)){
            return commandMap.get(command);
        } else {
            return null;
        }
    }
}
