package com.nttdata.reactivex.reactivex;

import reactor.core.publisher.Flux;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Flux<String> flux = Flux.just("A", "B", "C");
    	Flux<String> upper = flux
    			  .log()
    			  .map(String::toUpperCase);
    	System.out.println(upper);
    	Flux<String> flux = Flux.just("A", "B", "C")
        .map(i -> Person.builder()
                   .name(personProcessor.buildName())
                   .age(personProcessor.computeAge())
                   .build());
    	
    	private void personProcessor() {
    		  this.body.subscribe(DataBufferUtils.releaseConsumer());
    		}
    }
}
