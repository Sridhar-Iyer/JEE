package edu.training.FileCopy;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;


public class FileCopier 
{
    public static void main( String[] args ) throws Exception {
    
        // Create CamelContext
    	CamelContext context = new DefaultCamelContext();
    	
    	// add routes to the CamelContext
    	context.addRoutes(new RouteBuilder() {
    		public void configure() {
    			from("file:data/inbox?noop=true").to("file:data/outbox");
    		}
    	});
    	
    	/*ConfigureRoute cr = new ConfigureRoute();
    	
    	context.addRoutes(cr);*/
    	
    	
    	// start the route 
    	context.start();
    	
    	Thread.sleep(5000);
    	// stop the camel context
    	context.stop();
    	
    }
}
