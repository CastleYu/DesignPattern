package proxy;

public class SomeClassProxy implements Interface {
    // 实际类的代理，负责管理创建实际类的实例
    private SomeClass real = null;
    private String someParam;

    public SomeClassProxy(String someParam) {
        this.someParam = someParam;
    }

    @Override
    public void someMethod() {
        realize();
        real.someMethod();
    }

    public void realize() {
        if (real == null) {
            real = new SomeClass(someParam);
        }
    }
}