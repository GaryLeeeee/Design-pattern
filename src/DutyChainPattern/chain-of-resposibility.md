# 责任链模式
责任链模式就是一个请求，会按顺序经过多个处理器(handler)，保证执行的顺序，同时实现解耦

`Request`->`ConcreteHandler2`(before)->`ConcreteHandler2`(after)->end

---
* [CS-Notes 责任链模式](https://cyc2018.github.io/CS-Notes/#/notes/%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%20-%20%E8%B4%A3%E4%BB%BB%E9%93%BE)
* [Java设计模式之责任链模式、职责链模式](https://blog.csdn.net/jason0539/article/details/45091639)