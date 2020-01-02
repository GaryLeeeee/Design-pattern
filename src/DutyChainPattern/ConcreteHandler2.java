package DutyChainPattern;

/**
 * Created by GaryLee on 2019-12-31 17:53.
 */
public class ConcreteHandler2 extends Handler {
    public ConcreteHandler2(Handler successor) {
        super(successor);
    }

    @Override
    void handleRequest(Request request) {
        System.out.println(request.getName() + " is handle by ConcreteHandler2.");

        if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
