package AbstractFactory.factory;

public abstract class Link extends Item {
    //为何Link还是抽象类？Link中有抽象方法么？
    protected final String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
