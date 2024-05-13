package decorator;

public class Interface {
}

abstract class Decortator {
    protected Interface wrapped;

    public Decortator(Interface wrapped) {
        this.wrapped = wrapped;
    }

    public abstract void someMethod();
}