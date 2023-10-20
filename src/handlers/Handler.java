package handlers;

import gof.Request;

public interface Handler {
	void setNextHandler(Handler nextHandler);
    void handleRequest(Request request);
}
