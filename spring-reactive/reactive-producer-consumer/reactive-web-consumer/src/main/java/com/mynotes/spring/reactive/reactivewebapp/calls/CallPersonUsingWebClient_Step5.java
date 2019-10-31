package com.mynotes.spring.reactive.reactivewebapp.calls;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.reactive.function.client.WebClient;

import com.mynotes.spring.reactive.reactivewebapp.Person;


import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.subscriptions.Subscriptions;

public class CallPersonUsingWebClient_Step5 {
	//https://stackabuse.com/spring-reactor-tutorial/
	public static void main(String[] args) {
		//https://www.journaldev.com/22594/rxjava-observables-observers
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        Observable<Integer> fromObservable = Observable.from(numbers);

	        Subscriber<Integer> intSubscriber = new Subscriber<Integer>() {
	            @Override
	            public void onCompleted() {
	                System.out.println("onCompleted");
	            }

	            @Override
	            public void onError(Throwable e) {
	                System.out.println("onError");
	            }

	            @Override
	            public void onNext(Integer integer) {
	                System.out.println("onNext: "+ integer);
	            }
	        };

	        fromObservable.subscribe(intSubscriber);
	        numbers.add(411);
	}
	
	//https://www.baeldung.com/rxjava-multiple-subscribers-observable
	private static Observable getObservable() {
	    return Observable.create(subscriber -> {
	        subscriber.onNext(gettingValue(1));
	        subscriber.onNext(gettingValue(2));
	 
	        subscriber.add(Subscriptions.create(() -> {
	        	 System.out.println("Clear resources");
	        }));
	    });
	}
	
	private static Integer gettingValue(int i) {
		 System.out.println("Getting " + i);
	    return i;
	}
	
}