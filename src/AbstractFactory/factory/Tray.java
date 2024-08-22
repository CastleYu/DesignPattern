package AbstractFactory.factory;

import java.util.Vector;

public abstract class Tray extends Item {
    protected final Vector tray = new Vector();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
