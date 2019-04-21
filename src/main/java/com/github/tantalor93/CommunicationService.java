package com.github.tantalor93;

import javax.inject.Inject;

public class CommunicationService {

	private Communicator communicator;

	@Inject
	public CommunicationService(Communicator communicator) {
		this.communicator = communicator;
	}

	public void sendStatus() {
		communicator.send("READY");
	}
}
