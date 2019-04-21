package com.github.tantalor93.module;

import com.github.tantalor93.CommunicationService;
import com.github.tantalor93.Communicator;
import com.github.tantalor93.CommunicatorImpl;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class SimpleModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(Communicator.class).to(CommunicatorImpl.class).in(Singleton.class);
	}

	@Provides
	@Singleton
	public CommunicationService communicationService(Communicator communicator) {
		return new CommunicationService(communicator);
	}

}
