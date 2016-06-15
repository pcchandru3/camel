package com.camel;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;

public class FileCopyer {
	
	
	public static void main(String[] args){
		
		CamelContext context = new DefaultCamelContext();
		
		try {
			context.addRoutes(new RouteBuilder() {
				public void configure() {
					from("file:C:\\Camel\\input?noop=true").to("file:C:\\Camel\\output");
				}
			});
			
			
			context.start();
			
			Thread.sleep(5000);
			
			context.stop();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	

}


