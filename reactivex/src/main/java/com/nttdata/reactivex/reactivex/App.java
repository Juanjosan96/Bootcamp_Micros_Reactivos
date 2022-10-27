package com.nttdata.reactivex.reactivex;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Observable<String> messageSender =Observable.just("mensaje 1","mensaje2","mensaje3");
    
    	messageSender.subscribe(new Observer(){

			@Override
			public void onSubscribe(Disposable d) {

				System.out.println("Observer 1. Suscribed");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("Observer1." + t);				
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer 1. Error:"+e.getMessage());				
			}

			@Override
			public void onComplete() {
				System.out.println("Observer 1. Completed");				
			}
    		
    	});
    	messageSender.subscribe(new Observer(){

			@Override
			public void onSubscribe(Disposable d) {

				System.out.println("Observer 2. Suscribed");
			}

			@Override
			public void onNext(Object t) {
				System.out.println("Observer2."+ t);				
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer 2. Error:"+e.getMessage());				
			}

			@Override
			public void onComplete() {
				System.out.println("Observer 2. Completed");				
			}
    		
    	});
    }
}
