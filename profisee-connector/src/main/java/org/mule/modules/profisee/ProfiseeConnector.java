package org.mule.modules.profisee;

import org.mule.api.annotations.Config;
import org.mule.api.annotations.Connector;
import org.mule.modules.profisee.config.ConnectorConfig;

@Connector(name="profisee", friendlyName="Profisee", minMuleVersion = "3.7")
public class ProfiseeConnector {

    @Config
    ConnectorConfig config;

    public ConnectorConfig getConfig() {
        return config;
    }

    public void setConfig(ConnectorConfig config) {
        this.config = config;
    }
    
    public String getName(String yourName) {
    	return yourName;
    }
  
}