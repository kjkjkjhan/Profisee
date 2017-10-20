package org.mule.modules.profisee.config;

import java.util.ArrayList;
import java.util.List;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.WsdlProvider;
import org.mule.api.annotations.display.Password;
import org.mule.api.annotations.display.Placement;
import org.mule.api.annotations.ws.WsdlServiceEndpoint;
import org.mule.api.annotations.ws.WsdlServiceRetriever;
import org.mule.api.annotations.ws.WsdlTransportRetriever;
import org.mule.devkit.api.ws.definition.DefaultServiceDefinition;
import org.mule.devkit.api.ws.definition.ServiceDefinition;
import org.mule.devkit.api.ws.transport.HttpBasicWsdlTransport;
import org.mule.devkit.api.ws.transport.WsdlTransport;

@WsdlProvider(friendlyName = "Configuration")
public class ConnectorConfig {

	@Configurable
	@Placement(order = 1)
	private String username;

	@Configurable
	@Placement(order = 2)
	@Password
	private String password;

	@Configurable
	@Placement(order = 3)
	private String connectionUrl;

	@WsdlServiceRetriever
	public List<ServiceDefinition> getServiceDefinitions() {

		final List<ServiceDefinition> serviceDefinitions = new ArrayList<ServiceDefinition>();

		//"wsdl/Service.wsdl",
		serviceDefinitions.add(new DefaultServiceDefinition(
				"Web_wsHttpBinding",
				"Web (wsHttpBinding)",
				"http://corplthanbeenki.corp.profisee.com/Maestro/Service.svc?singleWsdl",
				"Web",
				"wsHttpBinding"));

		serviceDefinitions.add(new DefaultServiceDefinition(
				"Web_netTcpBinding",
				"Web (netTcpBinding)",
				"http://corplthanbeenki.corp.profisee.com/Maestro/Service.svc?singleWsdl",
				"Web",
				"netTcpBinding"));

		serviceDefinitions.add(new DefaultServiceDefinition(
				"Web_basicHttpBinding",
				"Web (basicHttpBinding)",
				"http://corplthanbeenki.corp.profisee.com/Maestro/Service.svc?singleWsdl",
				"Web",
				"basicHttpBinding"));
		return serviceDefinitions;
	}

	@WsdlServiceEndpoint
	public String getServiceEndpoint(ServiceDefinition definition) {
		return connectionUrl;
	}

	@WsdlTransportRetriever
	public WsdlTransport resolveTransport(ServiceDefinition serviceDefinition) {
		return new HttpBasicWsdlTransport(getUsername(), getPassword());
	}

	public String getConnectionUrl() {
		return connectionUrl;
	}

	public void setConnectionUrl(String connectionUrl) {
		this.connectionUrl = connectionUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}