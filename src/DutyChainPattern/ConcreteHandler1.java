package DutyChainPattern;

/**
 * Created by GaryLee on 2019-12-31 17:49.
 */
public class ConcreteHandler1 extends Handler {
    public ConcreteHandler1(Handler successor) {
        super(successor);
    }

    @Override
    void handleRequest(Request request) {
        System.out.println(request.getName() + " is handle by ConcreteHandler1.");

        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
