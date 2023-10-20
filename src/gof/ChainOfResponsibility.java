package gof;

import handlers.ConcreteHandler1;
import handlers.ConcreteHandler2;
import handlers.Handler;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        handler1.setNextHandler(handler2);

        Request request1 = new Request("Type1");
        Request request2 = new Request("Type2");

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
    }
}
