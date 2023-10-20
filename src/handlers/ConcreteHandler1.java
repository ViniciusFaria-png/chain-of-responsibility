package handlers;

import gof.Request;

public class ConcreteHandler1 implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (request.getType().equals("Type1")) {
            System.out.println("ConcreteHandler1 handles the request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
