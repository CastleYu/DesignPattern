package chainOfResponsibility;


public abstract class Interface {
    protected Interface next;

    public Interface setNext(Interface next) {
        this.next = next;
        return next;
    }

    public abstract void handelRequest(Object... params);
}
