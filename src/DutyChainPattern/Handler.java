package DutyChainPattern;

/**
 * Created by GaryLee on 2019-12-31 17:37.
 */
public abstract class Handler {

    /**
     * 下家，就是执行完当前handler(this)之后就会执行下家handler(successor)
     */
    Handler successor;

    public Handler(Handler successor){
        this.successor = successor;
    }

    abstract void handleRequest(Request request);
}
