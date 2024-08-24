package proxy;

class SomeClass implements Interface {
    // 实际类，负责实现具体功能
    private String someParam;

    public SomeClass(String someParam) {
        this.someParam = someParam;
    }

    @Override
    public void someMethod() {
    }

}
