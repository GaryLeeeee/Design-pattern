package DutyChainPattern;

public class Test {

    public static void main(String[] args) {
        //after是最后一个了
        Handler after = new ConcreteHandler1(null);
        //before的下一个为after
        Handler before = new ConcreteHandler2(after);

        Request request = new Request("test-request");

        //直接执行before就可以自动执行后续的after
        before.handleRequest(request);
    }
}