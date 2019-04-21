package com.github.tantalor93;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommunicatorImpl implements Communicator {

	private static final Logger LOGGER = LoggerFactory.getLogger(CommunicatorImpl.class);

	public CommunicatorImpl() {
		LOGGER.info("Initialized communicator instance.");
	}

	@Override
	public void send(String s) {
		LOGGER.info("Sending value '{}'.", s);
	}
}
