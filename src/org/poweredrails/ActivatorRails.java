package org.poweredrails;

import org.apache.logging.log4j.Logger;
import org.poweredrails.api.Rails;
import org.poweredrails.api.Server;

public class ActivatorRails implements Rails{
	
	Logger logger;
	Server server;
	
	public ActivatorRails(){
		server = new RailsServer();
	}
	
	@Override
	public Logger getLogger() {
		return logger;
	}

	@Override
	public Server getServer() {
		return server;
	}

}
