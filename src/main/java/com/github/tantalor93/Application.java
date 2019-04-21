package com.github.tantalor93;

import com.github.tantalor93.module.SimpleModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Application {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new SimpleModule());

		Communicator instance = injector.getInstance(Communicator.class);

		instance.send("ahoj");

		injector.getInstance(Communicator.class);

		CommunicationService service = injector.getInstance(CommunicationService.class);
		service.sendStatus();
	}
}
