package com.matthewtomich;

import static spark.Spark.*;
import spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
               return "Hello World!";
            }
         });

    	// test route
    	get(new Route("/goodbye") {
            @Override
            public Object handle(Request request, Response response) {
               return "Goodbye!";
            }
         });
    }
}
