package AbstractFactory.factory;

public abstract class Link extends Item {
    //Ϊ��Link���ǳ����ࣿLink���г��󷽷�ô��
    protected final String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
