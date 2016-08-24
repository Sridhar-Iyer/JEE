package edu.training.FileCopy;

import org.apache.camel.builder.RouteBuilder;

public class ConfigureRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		from("file:data/inbox?noop=true").to("file:data/outbox");
	}

}

//
